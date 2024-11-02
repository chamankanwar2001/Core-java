public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        try {
            Object obj = "Test";
            Integer num = (Integer) obj; 
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
