import java.util.*;

class InMemoryDatabase {
    private static InMemoryDatabase instance;
    private Map<String, User> users = new HashMap<>();
    private Map<String, Restaurant> restaurants = new HashMap<>();
    private Map<String, List<Item>> catalogs = new HashMap<>();
    private Map<String, List<Order>> userOrders = new HashMap<>();

    private InMemoryDatabase() {}

    public static InMemoryDatabase getInstance() {
        if (instance == null) instance = new InMemoryDatabase();
        return instance;
    }

    public Map<String, User> getUsers() {
        
        return users;
     }
    public Map<String, Restaurant> getRestaurants() { 
        
        
        return restaurants; 
    }
    public Map<String, List<Item>> getCatalogs() { 
        return catalogs;
     }
    public Map<String, List<Order>> getUserOrders() {
         return userOrders;
        
        }
}
