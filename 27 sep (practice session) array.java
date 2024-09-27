

peak element 



public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peak = findPeak(arr);
        System.out.println("Peak element: " + peak);
    }

    public static int findPeak(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }
       
        if (arr[0] > arr[1]) return arr[0];
        if (arr[n - 1] > arr[n - 2]) return arr[n - 1];
        return -1;  
    }
}


negative and positive element


public class Main {
    public static void main(String[] args) {
        int[] arr = {1, -3, 2, -5, -7, 4, -1};
        rearrange(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void rearrange(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
 

pascal's triangle in pyramid 



public class Main {
    public static void main(String[] args) {
        int rows = 5;  
        int[][] pascal = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1; 
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j]; 
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < rows - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println():
        }
    }
}
