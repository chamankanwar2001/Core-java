public class FindingMaximumElement {

        public static void main(String[] args) {
            int[][] arr = {
                {12, 45, 67},
                {23, 9, 13},
                {56, 34, 21}
            };
            int max = arr[0][0];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                }
            }
            System.out.println("Maximum element: " + max);
        }
    }
    
    
