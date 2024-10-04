import java.util.Scanner;
public class SumOfNaturalNumbersAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int n = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;  
            } else {
                sum -= i; 
            }
        }

        System.out.println("Sum of natural numbers till " + n + " with alternate signs: " + sum);
    }
}

    

