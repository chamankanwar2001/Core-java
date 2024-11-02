public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.nonexistent.ClassName"); 
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}
