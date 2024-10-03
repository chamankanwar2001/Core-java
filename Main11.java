/*public class Main11 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'e', 'i', 'o'};
        int count = 0;
        
        for (char ch : arr) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        
        System.out.println("Vowels: " + count);
    }
}


public class Main11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        int[] frequency = new int[10];
        int maxCount = 0, mostFrequent = -1;

        for (int num : arr) {
            frequency[num]++;
            if (frequency[num] > maxCount) {
                maxCount = frequency[num];
                mostFrequent = num;
            }
        }

        System.out.println("Most Frequent Element: " + mostFrequent);
    }
}




public class Main11 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int maxProduct = arr[0] * arr[1];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }

        System.out.println("Maximum Product  " + maxProduct);
    }
}








public class Main11 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};

        System.out.print("Intersection: ");
        for (int i : arr2) {
            for (int j = 0; j < arr1.length; j++) {
                if (i == arr1[j]) {
                    System.out.print(i + " ");
                    arr1[j] = -1; 
                    break;
                }
            }
        }
    }
}*/






public class Main11 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, -2, 9};
        int target = 9;

        System.out.println("Pairs with sum " + target + " ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j]);
                }
            }
        }
    }
}





/*public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        boolean isPalindrome = true;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome Array: " + isPalindrome);
    }
}





public class Main11 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum = ");
        for (int[] row : sum) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}





public class Main11 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        int[][] product = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                product[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
            }
        }

        System.out.println("Product = ");
        for (int[] row : product) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}




public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int diagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("Diagonal Sum = " + diagonalSum);
    }
}




public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5}, {7, 9, 11}, {13, 15, 17}};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Target found at (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Target not found");
        }
    }
}
 */

