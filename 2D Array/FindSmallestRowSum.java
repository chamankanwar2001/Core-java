public class FindSmallestRowSum {
        public static void main(String[] args) {
            int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            int minSum = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                int rowSum = 0;
                for (int j = 0; j < arr[i].length; j++) {
                    rowSum += arr[i][j];
                }
                if (rowSum < minSum) {
                    minSum = rowSum;
                }
            }
            System.out.println("Smallest row sum: " + minSum);
        }
    }
    
    

