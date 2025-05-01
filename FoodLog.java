import java.util.ArrayList;

public class FoodLog {
    private ArrayList<FoodItem> log;

    public FoodLog() {
        log = new ArrayList<>();
    }

    public void addFood(FoodItem food) {
        log.add(food);
        System.out.println(food.getName() + " added to your log.");
    }

    public int getTotalCalories() {
        return log.stream().mapToInt(FoodItem::getCalories).sum();
    }

    public int getTotalProtein() {
        return log.stream().mapToInt(FoodItem::getProtein).sum();
    }

    public int getTotalCarbs() {
        return log.stream().mapToInt(FoodItem::getCarbs).sum();
    }

    public void printLog() {
        System.out.println("Today's food log:");
        for (FoodItem food : log) {
            food.printInfo();
        }
        System.out.println("Total: " + getTotalCalories() + " kcal, " +
                getTotalProtein() + "g protein, " +
                getTotalCarbs() + "g carbs");
    }
}
