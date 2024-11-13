import java.util.Scanner;

public class ExceptionHandlingCase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number (dividend): ");
            int dividend = scanner.nextInt();

            System.out.print("Enter the second number (divisor): ");
            int divisor = scanner.nextInt();

            int result = divide(dividend, divisor);  
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");  
        } finally {
            scanner.close();
            System.out.println("Program ended.");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;  
    }
}
