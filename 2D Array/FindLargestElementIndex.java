public class FindLargestElementIndex {
        public static void main(String[] args) {
            int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            int max = arr[0][0];
            int rowIndex = 0;
            int colIndex = 0;
    
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                        rowIndex = i;
                        colIndex = j;
                    }
                }
            }
    
            System.out.println("Max element: " + max + " at index (" + rowIndex + ", " + colIndex + ")");
        }
    }
    
    

