
import java.io.*;
import java.util.*;

public class DemonstratingAllCases {
    public static void main(String[] args) {
        // 1. ArithmeticException (Division by zero)
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Case 1 - ArithmeticException: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[3];
            int y = arr[5];  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Case 2 - ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 3. NullPointerException
        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Case 3 - NullPointerException: " + e.getMessage());
        }

        // 4. NumberFormatException
        try {
            int num = Integer.parseInt("abc");  
        } catch (NumberFormatException e) {
            System.out.println("Case 4 - NumberFormatException: " + e.getMessage());
        }

        // 5. StringIndexOutOfBoundsException
        try {
            String str = "Java";
            char ch = str.charAt(10);  
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Case 5 - StringIndexOutOfBoundsException: " + e.getMessage());
        }

        // 6. ClassNotFoundException
        try {
            Class.forName("com.unknown.ClassName");  
        } catch (ClassNotFoundException e) {
            System.out.println("Case 6 - ClassNotFoundException: " + e.getMessage());
        }

        // 7. FileNotFoundException
        try {
            FileReader fr = new FileReader("non_existent_file.txt");  
        } catch (FileNotFoundException e) {
            System.out.println("Case 7 - FileNotFoundException: " + e.getMessage());
        }

        // 8. InputMismatchException
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int z = sc.nextInt();  
        } catch (InputMismatchException e) {
            System.out.println("Case 8 - InputMismatchException: " + e.getMessage());
        }

        // 9. InterruptedException
        try {
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            });
            t.start();
            t.interrupt();  
        } catch (Exception e) {
            System.out.println("Case 9 - InterruptedException: " + e.getMessage());
        }
    }
}
