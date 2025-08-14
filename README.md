#  Food Ordering System – Flipkart Machine Coding Round

##  Overview

---

## Features Implemented
- **User Registration** – Register new customers on the platform.
- **Restaurant Registration** – Register restaurants with GST, contact info, and catalog.
- **Catalog Management** – Restaurants can add items with price and quantity.
- **Search Items** – Search for specific items in a restaurant’s catalog (sorted by price).
- **Place Orders** – Customers can place orders from a restaurant’s catalog.
- **Get Orders** – Retrieve all orders placed by a user.
- **Cancel Orders** – Cancel an order (bonus feature), with status tracking.
- **Payment Strategy** – (Bonus Feature) Supports multiple payment methods using **Strategy Pattern**:
  - Credit Card
  - UPI
  - Cash on Delivery

---

## 🛠 Design Patterns Used
- **Singleton** → Central in-memory database (`InMemoryDatabase`).
- **Factory Method** → For creating `User`, `Restaurant`, and `Order` objects.
- **Repository Pattern** → Centralized data access layer.
- **Strategy Pattern** → Pluggable payment methods (`CreditCardPayment`, `UPIPayment`, `CashOnDeliveryPayment`).

---

## System Design

### Core Entities:
- **User** – Customer details.
- **Restaurant** – Restaurant details and catalog.
- **Item** – Menu item with price and available quantity.
- **Order** – Order details including items, quantity, status, and payment.
- **OrderStatus** – Enum for CONFIRMED / CANCELLED.

### Services:
- `UserService` – Handles user registration and retrieval.
- `RestaurantService` – Handles restaurant registration and catalog updates.
- `CatalogService` – Handles item searching.
- `OrderService` – Handles placing, retrieving, and cancelling orders.

---

##  How It Works
The system uses **hardcoded test cases** in the `main` method to demonstrate all functionalities:
1. Registers multiple users and restaurants.
2. Adds menu items to each restaurant.
3. Searches for items by name.
4. Places orders with different payment methods.
5. Retrieves orders for each user.
6. Cancels an order and shows updated order status.
7. Handles edge cases like insufficient quantity or double cancellation.

---

##  Example Output (Snippet)
User Registered! ID: 1a2b3c...
Restaurant Registered! ID: 9z8y7x...
Item added: Kaju Katli
Item added: Lassi
-- Search Kaju Katli in Radhe Krishna Sweets --
Kaju Katli 100.0 4
Paid ₹200.0 using Credit Card ending with 5678
Order placed! ID: abc123
-- Orders for Kashish --
abc123 CONFIRMED
Order cancelled: abc123
-- Orders for Kashish after cancellation --
abc123 CANCELLED
