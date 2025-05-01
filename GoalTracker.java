public class GoalTracker {
    private UserProfile user;
    private FoodLog log;

    public GoalTracker(UserProfile user, FoodLog log) {
        this.user = user;
        this.log = log;
    }

    public void checkGoals() {
        System.out.println("\n--- Goal Summary ---");
        compare("Calories", log.getTotalCalories(), user.getDailyCalorieGoal());
        compare("Protein (g)", log.getTotalProtein(), user.getDailyProteinGoal());
        compare("Carbs (g)", log.getTotalCarbs(), user.getDailyCarbGoal());
    }

    private void compare(String nutrient, int actual, int goal) {
        System.out.print(nutrient + ": " + actual + " / " + goal + " → ");
        if (actual == goal) {
            System.out.println("Goal Met ✅");
        } else if (actual < goal) {
            System.out.println("Under Target 🔻");
        } else {
            System.out.println("Over Target 🔺");
        }
    }
}
