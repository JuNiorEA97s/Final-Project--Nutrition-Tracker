public class FoodItem {
    private String name;
    private int calories;
    private int protein;
    private int carbs;

    public FoodItem(String name, int calories, int protein, int carbs) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
    }

    public String getName() { return name; }
    public int getCalories() { return calories; }
    public int getProtein() { return protein; }
    public int getCarbs() { return carbs; }

    public void printInfo() {
        System.out.println(name + " - " + calories + " kcal, " + protein + "g protein, " + carbs + "g carbs");
    }
}
