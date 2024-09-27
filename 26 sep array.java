pascle triangle


public class Main {
    public static void main(String[] args) {
        int rows = 5;  
        int[][] pascal = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;  /
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];  
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();  
        }
    }
}
