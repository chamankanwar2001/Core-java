import java.util.Scanner;

public class ArrayMnc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        
        int D = sc.nextInt();
        int fine = sc.nextInt();
        
        int totalFine = 0;
        boolean isEvenDate = D % 2 == 0;
        
        for (int i = 0; i < N; i++) {
            if (isEvenDate && a[i] % 2 != 0 || !isEvenDate && a[i] % 2 == 0) {
                totalFine += fine;
            }
        }
        
        System.out.println(totalFine);
    }
}


