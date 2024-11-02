public class Trycatchfinally {

        public static void main(String[] args) {
            try {
                int result = 10 / 0; // try--> catch --> finally
            } catch (ArithmeticException e) {
                System.out.println("message");
            } finally {
                System.out.println("message");
            }
            System.out.println("last message");
        }
 }
    
    

