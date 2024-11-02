import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("nonexistentfile.txt"); // Nonexistent file
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }
}
