public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0, right = arr.length - 1;
        int[] result = new int[arr.length];
        
        int evenPointer = 0;
        int oddPointer = arr.length - 1;
        
        while (left <= right) {
            if (arr[left] % 2 == 0) {
                result[evenPointer++] = arr[left]; 
            } else {
                result[oddPointer--] = arr[left];  
            }
            left++;
        }
        
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenPointer; i++) {
            System.out.print(result[i] + " ");
        }
        
        System.out.println("\nOdd Numbers:");
        for (int i = arr.length - 1; i > oddPointer; i--) {
            System.out.print(result[i] + " ");
        }
    }
}
