/*public class ArithemticException1 {
    public static void main(String[] args) {
        try {
            int a = 7;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException ex) {
            System.out.println("exception handle");
        }
    }
}*/



public class ArithemticException1 {
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