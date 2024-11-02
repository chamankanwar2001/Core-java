public class InterruptedExceptionDemo {
    public static void main(String[] args) {
        try {
            Thread.currentThread().interrupt();
            Thread.sleep(100); 
        } catch (InterruptedException e) {
            System.out.println("Caught InterruptedException: " + e.getMessage());
            Thread.currentThread().interrupt(); 
        }
    }
}
