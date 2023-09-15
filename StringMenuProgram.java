import java.util.Scanner;

public class StringMenuProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            displayMenu();
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // Perform action for option 1
                    System.out.println("You selected Option 1.");
                    break;
                case "2":
                    // Perform action for option 2
                    System.out.println("You selected Option 2.");
                    break;
                case "3":
                    // Perform action for option 3
                    System.out.println("You selected Option 3.");
                    break;
                case "4":
                    // Perform action for option 4
                    System.out.println("You selected Option 4.");
                    break;
                case "5":
                    // Perform action for option 5
                    System.out.println("You selected Option 5.");
                    break;
                case "6":
                    // Perform action for option 6 (Exit)
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

        } while (!choice.equals("6")); // Continue until the user selects option 6 (Exit)

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Option 4");
        System.out.println("5. Option 5");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }
}
