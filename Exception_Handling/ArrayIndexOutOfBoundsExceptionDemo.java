public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
