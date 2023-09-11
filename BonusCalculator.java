import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Ask the user for their years of service
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Check if the employee's years of service is more than 5
        if (yearsOfService > 5) {
            // Calculate the bonus amount (5% of salary)
            double bonusAmount = 0.05 * salary;
            System.out.printf("You are eligible for a bonus of $%.2f%n", bonusAmount);
        } else {
            System.out.println("Sorry, you are not eligible for a bonus.");
        }
    }
}
