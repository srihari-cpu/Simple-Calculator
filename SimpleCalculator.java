import java.util.Scanner;

public class SimpleCalculator {

    // Method to perform addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to perform subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to perform multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to perform division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return Double.NaN; // Return Not-a-Number (NaN) if division by zero
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Welcome message
        System.out.println("Welcome to the Simple Calculator!");
        
        while (true) {
            try {
                // Take user input for the first number
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                // Take user input for the second number
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                // Prompt user to select an operation
                System.out.println("Select an operation:");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.print("Enter your choice (1/2/3/4): ");
                int choice = scanner.nextInt();

                double result = 0;

                // Perform the operation based on the user's choice
                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case 4:
                        result = divide(num1, num2);
                        if (!Double.isNaN(result)) {
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        }
                        break;
                    default:
                        System.out.println("Invalid operation! Please choose a valid option.");
                        break;
                }

                // Ask the user if they want to perform another calculation
                System.out.print("Do you want to perform another calculation? (yes/no): ");
                String continueChoice = scanner.next();
                if (continueChoice.equalsIgnoreCase("no")) {
                    break;
                }
            } catch (Exception e) {
                // Handle invalid input (e.g., non-numeric values)
                System.out.println("Invalid input! Please enter numeric values.");
                scanner.nextLine(); // Clear the buffer
            }
        }
        
        System.out.println("Thank you for using the Simple Calculator. Goodbye!");
        scanner.close();
    }
}
