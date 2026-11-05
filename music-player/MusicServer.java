import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class MusicServer {

    private static final String UPLOAD_DIR = "uploads";
    private static final Path LOCAL_DB_FILE = Paths.get("tracks_db.txt");

    public static void main(String[] args) throws Exception {
        Files.createDirectories(Paths.get(UPLOAD_DIR));
        if (!Files.exists(LOCAL_DB_FILE)) {
            Files.createFile(LOCAL_DB_FILE);
        }

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/api/tracks", MusicServer::handleTracksApi);
        server.createContext("/uploads/", MusicServer::handleAudioStream);

        server.setExecutor(null);
        System.out.println("==========================================");
        System.out.println("Retro Music Server running on port 8080!");
        System.out.println("Storage Mode: Local File DB (No MySQL required)");
        System.out.println("==========================================");
        server.start();
    }

    private static void handleTracksApi(HttpExchange exchange) throws IOException {
        addCorsHeaders(exchange);
        String method = exchange.getRequestMethod();

        if ("OPTIONS".equalsIgnoreCase(method)) {
            exchange.sendResponseHeaders(204, -1);
            return;
        }

        if ("GET".equalsIgnoreCase(method)) {
            List<String> lines = Files.readAllLines(LOCAL_DB_FILE, StandardCharsets.UTF_8);
            StringBuilder json = new StringBuilder("[");
            boolean first = true;
            int id = 1;

            for (String line : lines) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split("\\|", 2);
                if (parts.length == 2) {
                    if (!first) json.append(",");
                    json.append(String.format("{\"id\":%d,\"title\":\"%s\",\"filename\":\"%s\"}",
                            id++, escapeJson(parts[0]), escapeJson(parts[1])));
                    first = false;
                }
            }
            json.append("]");

            byte[] response = json.toString().getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, response.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response);
            }

        } else if ("POST".equalsIgnoreCase(method)) {
            Map<String, String> params = parseQueryParams(exchange.getRequestURI().getRawQuery());
            String title = params.getOrDefault("title", "Untitled Track");
            String filename = System.currentTimeMillis() + "_" + params.getOrDefault("filename", "track.mp3");

            Path filePath = Paths.get(UPLOAD_DIR, filename);
            try (InputStream is = exchange.getRequestBody()) {
                Files.copy(is, filePath, StandardCopyOption.REPLACE_EXISTING);
            }

            // Save record to tracks_db.txt
            String record = title.replace("|", "-") + "|" + filename + System.lineSeparator();
            Files.write(LOCAL_DB_FILE, record.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

            byte[] response = "{\"status\":\"saved\"}".getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(201, response.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response);
            }
        }
    }

    private static void handleAudioStream(HttpExchange exchange) throws IOException {
        addCorsHeaders(exchange);
        String requestedFile = URLDecoder.decode(
                exchange.getRequestURI().getPath().replaceFirst("/uploads/", ""),
                StandardCharsets.UTF_8
        );

        Path filePath = Paths.get(UPLOAD_DIR, requestedFile);
        if (!Files.exists(filePath)) {
            exchange.sendResponseHeaders(404, -1);
            return;
        }

        exchange.getResponseHeaders().set("Content-Type", "audio/mpeg");
        long fileSize = Files.size(filePath);
        exchange.sendResponseHeaders(200, fileSize);
        try (OutputStream os = exchange.getResponseBody()) {
            Files.copy(filePath, os);
        }
    }

    private static void addCorsHeaders(HttpExchange exchange) {
        exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
        exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
        exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type");
    }

    private static Map<String, String> parseQueryParams(String query) {
        Map<String, String> map = new HashMap<>();
        if (query == null) return map;
        for (String pair : query.split("&")) {
            String[] parts = pair.split("=", 2);
            if (parts.length == 2) {
                map.put(
                    URLDecoder.decode(parts[0], StandardCharsets.UTF_8),
                    URLDecoder.decode(parts[1], StandardCharsets.UTF_8)
                );
            }
        }
        return map;
    }

    private static String escapeJson(String str) {
        return str == null ? "" : str.replace("\"", "\\\"");
    }
}