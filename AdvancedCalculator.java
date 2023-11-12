import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Advanced Calculator");
        System.out.println("-------------------");

        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /, sqrt, ^, sin, cos, tan): ");
        operator = scanner.next().charAt(0);

        if (operator != 's' && operator != '^' && operator != 'c' && operator != 't') {
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
        } else {
            num2 = 0;  // For operations with only one operand (sqrt, sin, cos, tan)
        }

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                    return;
                }
                break;
            case 's':
                result = Math.sqrt(num1);
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            case 'c':
                result = Math.cos(Math.toRadians(num1));  // Convert degrees to radians for trigonometric functions
                break;
            case 't':
                result = Math.tan(Math.toRadians(num1));  // Convert degrees to radians for trigonometric functions
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
