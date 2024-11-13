public class ThrowsKeywordExample {
    public static void main(String[] args) {
        try {
            divide(10, 0); 
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception in main: " + e.getMessage());
        }
    }

    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }
}
