import java.util.Scanner;

public class NutritionTrackerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Welcome to the Calorie and Nutrition Tracker ===");

        // 1. Create user profile
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your weight (lbs): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (inches): ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter your activity level (Low/Medium/High): ");
        String activity = scanner.nextLine();

        UserProfile user = new UserProfile(age, weight, height, activity);
        FoodLog log = new FoodLog();
        FoodDatabase db = new FoodDatabase();
        GoalTracker tracker = new GoalTracker(user, log);

        user.printProfile();

        // 2. Main loop
        boolean running = true;
        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Enter food manually");
            System.out.println("2. Choose food from database");
            System.out.println("3. View food log and summary");
            System.out.println("4. Check goals");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter food name: ");
                    String name = scanner.nextLine();
                    System.out.print("Calories: ");
                    int cal = scanner.nextInt();
                    System.out.print("Protein (g): ");
                    int pro = scanner.nextInt();
                    System.out.print("Carbs (g): ");
                    int carb = scanner.nextInt();
                    scanner.nextLine(); 
                    log.addFood(new FoodItem(name, cal, pro, carb));
                    break;

                case 2:
                    db.listFoods();
                    System.out.print("Enter food name from list: ");
                    String foodName = scanner.nextLine();
                    FoodItem item = db.getFood(foodName);
                    if (item != null) {
                        log.addFood(item);
                    } else {
                        System.out.println("Food not found.");
                    }
                    break;

                case 3:
                    log.printLog();
                    break;

                case 4:
                    tracker.checkGoals();
                    break;

                case 5:
                    System.out.println("Thanks for using the tracker. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
