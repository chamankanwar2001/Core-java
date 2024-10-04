public class FindSumOfElementBorder {

        public static void main(String[] args) {
            int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            int sum = 0;
            int rows = arr.length;
            int cols = arr[0].length;
    
            for (int j = 0; j < cols; j++) {
                sum += arr[0][j]; 
                sum += arr[rows - 1][j]; 
            }
    
            for (int i = 1; i < rows - 1; i++) {
                sum += arr[i][0]; 
                sum += arr[i][cols - 1]; 
            }
    
            System.out.println("Sum of border elements: " + sum);
        }
    }
    
    

