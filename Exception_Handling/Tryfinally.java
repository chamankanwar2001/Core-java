public class Tryfinally {
        public static void main(String[] args) {
            try {
                int result = 10 / 0; // try ---> finally
            } finally {
                System.out.println("message");
            }
            System.out.println("last message");
        }
    }
    
    

