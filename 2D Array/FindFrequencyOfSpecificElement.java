import java.util.Scanner;
public class FindFrequencyOfSpecificElement {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 2, 6},
            {7, 8, 2}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to find frequency: ");
        int target = sc.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    count++;
                }
            }
        }
        System.out.println("Frequency of " + target + ": " + count);
    }
}

    

