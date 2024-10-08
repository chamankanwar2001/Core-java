public class ArithmaticException1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException ex) {
            System.out.println("Exception Handle");
        } finally {
            System.out.println("always executed");
        }
    }
    
    
}
