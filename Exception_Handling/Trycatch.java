public class Trycatch {
    
        public static void main(String[] args) {
            try {
                int result = 10 / 0; // try ---> catch
            } catch (ArithmeticException e) {
                System.out.println("message");
            }
            System.out.println("last message");
        }
}
    
    

