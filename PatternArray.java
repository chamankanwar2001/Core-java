/*public class PatternArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 7, 3, 8, 2}; 
        
        for(int num : arr) {
            if(num == 0) {
                System.out.println();  
                continue;
            }
            for(int i = 1; i <= num; i++) {
                System.out.print("*"); 
            }
            System.out.println();  
        }
    }

    
}*/


/*public class PatternArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 7, 3, 8, 2}; 
        
        for (int num : arr) {
            if (num == 0) {
                System.out.println();  
                continue;
            }
            if (num == 1) {
                System.out.println("*   * * * *"); 
            } else if (num == 7) {
                System.out.println("    * * * *"); 
            } else if (num == 3) {
                System.out.println("/t* * *");    
            } else if (num == 8) {
                for (int i = 0; i < 4; i++) {
                    System.out.println("/t*   *"); 
                }
            } else if (num == 2) {
                System.out.println("        *");   
            }
        }
    }
}

 */

//import java.util.Scanner;

//public class PatternArray {
    //public static void main(String[] args) {
        // int n = 5; 
        // int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1}; 

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (j <= i || j >= arr.length - i - 1) {
        //             System.out.print(arr[j] + " ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
    //}


    import java.util.Scanner;
    public class PatternArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int temp = n;
        while(temp > 0){
            for(int i = 1 ; i <= n ; i++){
                if(temp == n || i == 1 || i == temp){
                    System.out.print(i+ " ");
                }
                else System.out.print("  ");
            }
            for(int i = n-1 ; i >= 1 ; i--){
                if(temp == n || i == 1 || i == temp){
                    System.out.print(i+ " ");
                }
                else System.out.print("  ");
            }
            System.out.println();
            temp--;
        }
    }
}

