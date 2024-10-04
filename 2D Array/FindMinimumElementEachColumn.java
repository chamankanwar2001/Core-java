public class FindMinimumElementEachColumn {
        public static void main(String[] args) {
            int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            for (int j = 0; j < arr[0].length; j++) {
                int min = arr[0][j];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i][j] < min) {
                        min = arr[i][j];
                    }
                }
                System.out.println("Min element in column " + (j + 1) + ": " + min);
            }
        }
    }
    
    

