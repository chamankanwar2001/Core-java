public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}
