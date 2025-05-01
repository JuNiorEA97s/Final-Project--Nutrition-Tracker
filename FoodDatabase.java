import java.util.HashMap;

public class FoodDatabase {
    private HashMap<String, FoodItem> foods;

    public FoodDatabase() {
        foods = new HashMap<>();
        foods.put("banana", new FoodItem("Banana", 105, 1, 27));
        foods.put("chicken", new FoodItem("Chicken Breast (100g)", 165, 31, 0));
        foods.put("rice", new FoodItem("White Rice (1 cup)", 200, 4, 45));
        // Add more as needed
    }

    public FoodItem getFood(String name) {
        return foods.get(name.toLowerCase());
    }

    public void listFoods() {
        System.out.println("Available foods in database:");
        for (String key : foods.keySet()) {
            foods.get(key).printInfo();
        }
    }
}
