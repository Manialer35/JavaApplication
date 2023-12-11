import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");

        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Result: " + result);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
