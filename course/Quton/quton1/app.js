// 1. Menu Dataset
const MENU_ITEMS = [
  {
    id: 1,
    name: "Truffle Arancini",
    category: "small-plates",
    price: 380,
    badge: "Chef's Pick",
    desc: "Crispy wild mushroom risotto spheres with black garlic aioli."
  },
  {
    id: 2,
    name: "Charred Burrata Flatbread",
    category: "small-plates",
    price: 450,
    badge: "Vegetarian",
    desc: "Sourdough blistered flatbread, heirloom cherry tomatoes, basil oil."
  },
  {
    id: 3,
    name: "Smoked Harissa Paneer Skewers",
    category: "small-plates",
    price: 390,
    badge: "Spicy",
    desc: "Wood-fired cottage cheese glazed with rose harissa and mint yogurt."
  },
  {
    id: 4,
    name: "Wild Mushroom Tagliatelle",
    category: "mains",
    price: 620,
    badge: "Bestseller",
    desc: "Hand-cut pasta tossed in porcini butter, thyme, and aged parmesan."
  },
  {
    id: 5,
    name: "Herb-Crusted Sea Bass",
    category: "mains",
    price: 780,
    badge: "Gluten-Free",
    desc: "Pan-seared fillet over saffron crushed potatoes and lemon caper velouté."
  },
  {
    id: 6,
    name: "Smoked Espresso Tonic",
    category: "drinks",
    price: 260,
    badge: "Signature",
    desc: "Double shot single-origin espresso over artisanal botanical tonic."
  },
  {
    id: 7,
    name: "Spiced Hibiscus Cooler",
    category: "drinks",
    price: 220,
    badge: "Zero Proof",
    desc: "Cold-brewed hibiscus petals, star anise, and fresh pomegranate."
  },
  {
    id: 8,
    name: "Basque Burnt Cheesecake",
    category: "desserts",
    price: 360,
    badge: "Must Try",
    desc: "Caramelized crust with a creamy center, served with berry compote."
  }
];

// Theme metadata to demonstrate Quton's Theme-Adaptive UI
const THEME_PROFILES = {
  bistro: {
    name: "The Artisan Table",
    tagline: "Wood-fired craft kitchen & specialty pours"
  },
  luxe: {
    name: "Nocturne Lounge & Grill",
    tagline: "Late-night tasting plates & reserve cocktails"
  },
  cafe: {
    name: "Verdant Greenhouse Cafe",
    tagline: "Organic all-day brunch & botanical infusions"
  }
};

// State
let currentTable = "04";
let activeAlerts = [];
let adClicks = 18;

// DOM Elements
const tableSelect = document.getElementById("table-select");
const themeSelect = document.getElementById("theme-select");
const restaurantName = document.getElementById("restaurant-name");
const restaurantTagline = document.getElementById("restaurant-tagline");
const menuGrid = document.getElementById("menu-grid");
const categoryNav = document.getElementById("category-nav");
const alertQueue = document.getElementById("alert-queue");
const metricAlerts = document.getElementById("metric-alerts");
const metricAds = document.getElementById("metric-ads");
const adClickBtn = document.getElementById("ad-click-btn");
const toast = document.getElementById("toast");

// 2. Render Menu Items
function renderMenu(category = "all") {
  menuGrid.innerHTML = "";
  const filtered = category === "all"
    ? MENU_ITEMS
    : MENU_ITEMS.filter(item => item.category === category);

  filtered.forEach(item => {
    const card = document.createElement("article");
    card.className = "menu-card";
    card.innerHTML = `
      <div class="item-info">
        <h3>
          ${item.name}
          <span class="badge-tag">${item.badge}</span>
        </h3>
        <p class="item-desc">${item.desc}</p>
      </div>
      <div class="item-price">₹${item.price}</div>
    `;
    menuGrid.appendChild(card);
  });
}

// 3. Render Waitstaff Live Alert Queue
function renderAlertQueue() {
  metricAlerts.textContent = activeAlerts.length;

  if (activeAlerts.length === 0) {
    alertQueue.innerHTML = `<li class="empty-queue">No active table alerts right now.</li>`;
    return;
  }

  alertQueue.innerHTML = "";
  activeAlerts.forEach(ticket => {
    const li = document.createElement("li");
    li.className = "alert-ticket";
    li.innerHTML = `
      <div class="ticket-meta">
        <strong>Table #${ticket.table} — ${ticket.type}</strong>
        <span class="ticket-time">Sent at ${ticket.time}</span>
      </div>
      <button class="resolve-btn" data-id="${ticket.id}">Clear</button>
    `;
    alertQueue.appendChild(li);
  });
}

// 4. Trigger Silent Staff Alert
function triggerSilentAlert(alertType) {
  const now = new Date();
  const timeString = now.toLocaleTimeString([], { hour: "2-digit", minute: "2-digit" });

  const newTicket = {
    id: Date.now(),
    table: currentTable,
    type: alertType,
    time: timeString
  };

  activeAlerts.unshift(newTicket);
  renderAlertQueue();
  showToast(`Silent alert sent: ${alertType} (Table #${currentTable})`);
}

// 5. Show Toast Notification
let toastTimeout;
function showToast(message) {
  toast.textContent = message;
  toast.classList.add("show");
  clearTimeout(toastTimeout);
  toastTimeout = setTimeout(() => {
    toast.classList.remove("show");
  }, 2600);
}

// 6. Event Listeners
function initEvents() {
  // Interactive Table Selector (Tables 1 to 16)
  tableSelect.addEventListener("change", (e) => {
    currentTable = e.target.value;
    showToast(`Switched active table to Table #${currentTable}`);
  });

  // Category Filtering
  categoryNav.addEventListener("click", (e) => {
    const btn = e.target.closest(".cat-btn");
    if (!btn) return;
    document.querySelectorAll(".cat-btn").forEach(b => b.classList.remove("active"));
    btn.classList.add("active");
    renderMenu(btn.dataset.category);
  });

  // Theme-Adaptive Switcher
  themeSelect.addEventListener("change", (e) => {
    const theme = e.target.value;
    document.body.setAttribute("data-theme", theme);
    if (THEME_PROFILES[theme]) {
      restaurantName.textContent = THEME_PROFILES[theme].name;
      restaurantTagline.textContent = THEME_PROFILES[theme].tagline;
    }
    showToast(`Switched to ${themeSelect.options[themeSelect.selectedIndex].text} theme`);
  });

  // Silent Alert Buttons
  document.querySelectorAll(".alert-btn").forEach(btn => {
    btn.addEventListener("click", () => {
      triggerSilentAlert(btn.dataset.alert);
    });
  });

  // Clear Alert on Staff Dashboard
  alertQueue.addEventListener("click", (e) => {
    const resolveBtn = e.target.closest(".resolve-btn");
    if (!resolveBtn) return;
    const id = Number(resolveBtn.dataset.id);
    activeAlerts = activeAlerts.filter(item => item.id !== id);
    renderAlertQueue();
  });

  // Sponsored Ad Click Tracking
  adClickBtn.addEventListener("click", () => {
    adClicks += 1;
    metricAds.textContent = adClicks;
    triggerSilentAlert("Sponsored Offer: Craft Kombucha");
  });
}

// Initialize App
renderMenu("all");
renderAlertQueue();
initEvents();