
        // --- Mock Data ---
        const menuData = [
            {
                category: "Appetizers",
                items: [
                    { name: "Truffle Parmesan Fries", desc: "Crispy fries tossed in white truffle oil and aged parmesan.", price: "₹450", img: "https://placehold.co/200x200/f39c12/ffffff?text=Fries" },
                    { name: "Crispy Calamari", desc: "Served with house-made garlic aioli and lemon wedge.", price: "₹650", img: "https://placehold.co/200x200/e67e22/ffffff?text=Calamari" },
                ]
            },
            {
                category: "Main Courses",
                items: [
                    { name: "Wagyu Signature Burger", desc: "Brioche bun, caramelized onions, cheddar, signature sauce.", price: "₹1200", img: "https://placehold.co/200x200/c0392b/ffffff?text=Burger" },
                    { name: "Pan-Seared Salmon", desc: "Wild-caught salmon with asparagus and lemon butter sauce.", price: "₹1800", img: "https://placehold.co/200x200/d35400/ffffff?text=Salmon" },
                ]
            },
            {
                category: "Drinks",
                items: [
                    { name: "Artisan Lemonade", desc: "Freshly squeezed lemons with a hint of mint.", price: "₹250", img: "https://placehold.co/200x200/f1c40f/ffffff?text=Lemonade" },
                    { name: "Espresso Martini", desc: "Vodka, fresh espresso, coffee liqueur.", price: "₹750", img: "https://placehold.co/200x200/8e44ad/ffffff?text=Martini" },
                ]
            }
        ];

        // --- Themes ---
        const themes = ["root", "dark", "luxury"];
        let currentThemeIndex = 0;

        function toggleTheme() {
            currentThemeIndex = (currentThemeIndex + 1) % themes.length;
            document.getElementById('app-container').setAttribute('data-theme', themes[currentThemeIndex]);
            triggerAlert('Theme Updated', `Switched to ${themes[currentThemeIndex] === 'root' ? 'Light' : themes[currentThemeIndex]} mode.`);
        }

        // --- Render UI ---
        function renderMenu() {
            const navContainer = document.getElementById('category-nav');
            const menuContainer = document.getElementById('menu-content');
            
            navContainer.innerHTML = '';
            menuContainer.innerHTML = '';

            menuData.forEach((section, index) => {
                // Render Nav Tags
                const isActive = index === 0;
                const navBtn = document.createElement('button');
                navBtn.className = `whitespace-nowrap px-4 py-1.5 rounded-full text-sm font-semibold transition-colors border ${isActive ? 'bg-brand-primary text-brand-surface border-brand-primary' : 'bg-transparent text-brand-muted border-brand-border'}`;
                navBtn.innerText = section.category;
                navBtn.onclick = () => {
                    document.getElementById(`section-${index}`).scrollIntoView({ behavior: 'smooth', block: 'start' });
                };
                navContainer.appendChild(navBtn);

                // Render Menu Section
                const sectionDiv = document.createElement('div');
                sectionDiv.id = `section-${index}`;
                
                const sectionTitle = document.createElement('h2');
                sectionTitle.className = "text-xl font-bold text-brand-text mb-4";
                sectionTitle.innerText = section.category;
                sectionDiv.appendChild(sectionTitle);

                const itemsDiv = document.createElement('div');
                itemsDiv.className = "space-y-4";

                section.items.forEach(item => {
                    const itemCard = document.createElement('div');
                    itemCard.className = "bg-brand-surface border border-brand-border rounded-2xl p-3 flex gap-4 shadow-sm active:scale-[0.99] transition-transform";
                    itemCard.innerHTML = `
                        <img src="${item.img}" alt="${item.name}" class="w-24 h-24 rounded-xl object-cover">
                        <div class="flex-1 py-1 flex flex-col justify-between">
                            <div>
                                <h3 class="text-base font-bold text-brand-text leading-tight">${item.name}</h3>
                                <p class="text-xs text-brand-muted mt-1 line-clamp-2">${item.desc}</p>
                            </div>
                            <div class="flex justify-between items-center mt-2">
                                <span class="font-bold text-brand-primary text-sm">${item.price}</span>
                                <button class="w-7 h-7 rounded-full bg-brand-bg border border-brand-border flex items-center justify-center text-brand-text">
                                    <i class="ph ph-plus font-bold"></i>
                                </button>
                            </div>
                        </div>
                    `;
                    itemsDiv.appendChild(itemCard);
                });

                sectionDiv.appendChild(itemsDiv);
                menuContainer.appendChild(sectionDiv);
            });
        }

        // --- Silent Alert Toast System ---
        function triggerAlert(title, message) {
            const container = document.getElementById('toast-container');
            
            const toast = document.createElement('div');
            toast.className = 'bg-brand-primary text-brand-surface px-5 py-3 rounded-2xl shadow-lg flex items-center gap-3 toast-enter pointer-events-auto';
            
            toast.innerHTML = `
                <div class="w-8 h-8 rounded-full bg-brand-surface/20 flex items-center justify-center shrink-0">
                    <i class="ph ph-check-circle text-xl"></i>
                </div>
                <div>
                    <h4 class="text-sm font-bold">${title}</h4>
                    <p class="text-xs opacity-90">${message}</p>
                </div>
            `;
            
            container.appendChild(toast);
            
            // Haptic feedback (if supported by mobile browser)
            if (navigator.vibrate) {
                navigator.vibrate(50);
            }

            // Remove toast after 3 seconds
            setTimeout(() => {
                toast.style.opacity = '0';
                toast.style.transform = 'translateY(-10px) translateX(-50%)';
                toast.style.transition = 'all 0.3s ease-in';
                setTimeout(() => {
                    toast.remove();
                }, 300);
            }, 3000);
        }

        // Initialize App
        document.addEventListener('DOMContentLoaded', () => {
            renderMenu();
        });