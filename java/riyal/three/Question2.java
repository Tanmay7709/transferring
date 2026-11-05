import java.util.Map; 
import java.util.TreeMap; 

public class Question2 {
  public static void main(String[] args) {
    TreeMap<Integer, String> students = new TreeMap<>();
    students.put(104, "bob");
    students.put(101, "bobby");
    students.put(103, "blue");
    students.put(105, "red");
    students.put(102, "green");
    System.out.println("sorted list: ");
    for(Map.Entry<Integer, String> entry : students.entrySet()) {
      System.out.println("Roll no: " + entry.getKey() + " | name : " + entry.getValue());
    }
  }
}