public class UserProfile {
    private int age;
    private double weight;
    private double height;
    private String activityLevel;
    private int dailyCalorieGoal;
    private int dailyProteinGoal;
    private int dailyCarbGoal;

    public UserProfile(int age, double weight, double height, String activityLevel) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activityLevel = activityLevel;
        setDailyGoals();
    }

    private void setDailyGoals() {
        // Simple formula-based goal setting (can be adjusted)
        this.dailyCalorieGoal = (int) (weight * 15);
        this.dailyProteinGoal = (int) (weight * 1.0);
        this.dailyCarbGoal = (int) (weight * 2.0);
    }

    public int getDailyCalorieGoal() { return dailyCalorieGoal; }
    public int getDailyProteinGoal() { return dailyProteinGoal; }
    public int getDailyCarbGoal() { return dailyCarbGoal; }

    public void printProfile() {
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Height: " + height + " inches");
        System.out.println("Activity Level: " + activityLevel);
        System.out.println("Daily Goals - Calories: " + dailyCalorieGoal +
                           ", Protein: " + dailyProteinGoal +
                           "g, Carbs: " + dailyCarbGoal + "g");
    }
}
