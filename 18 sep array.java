array maximum element : 
1 5 4 2 3 


public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 3};
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        System.out.println("Maximum element: " + max);
    }
}

-------------------------------------
array minimum element 

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 3};
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        System.out.println("Minimum element: " + min);
    }
}



-------------------------------------
array maximum element second maximum 

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 3};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) {
                secondMax = i;
            }
        }
        System.out.println("Second maximum element: " + secondMax);
    }
}


-------------------------------------
array second minimum 

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 3};
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) {
                secondMin = min;
                min = i;
            } else if (i < secondMin && i != min) {
                secondMin = i;
            }
        }
        System.out.println("Second minimum element: " + secondMin);
    }
}



-------------------------------------
prefix sum with using extra space 

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }
    }
}


-------------------------------------
prefix sum without using extra space 

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        for (int sum : arr) {
            System.out.print(sum + " ");
        }
    }
}


-------------------------------------
prefix sum : 
	array : starting and ending prefix sum 
	
	public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 1, end = 4;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        System.out.println("Prefix sum from index " + start + " to " + end + " is: " + sum);
    }
}



-------------------------------------
user input :
	3 
	1 2 3 4 5 6 7 8 9 10 
	

output :10 9 8 4 5 6 7 3 2 1 


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rotations = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, rotations - 1);
        reverse(arr, rotations, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

-------------------------------------
user input :
	3 
	1 2 3 4 5 6 7 8 9 10 
	

output :10 9 8 4 5 6 7 3 2 1 
every rotation :first rotate 
		second time rotation
		third time rotation 


public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rotations = 3;
        rotate(arr, rotations);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void rotate(int[] arr, int rotations) {
        int len = arr.length;
        reverse(arr, 0, len - 1);
        reverse(arr, 0, rotations - 1);
        reverse(arr, rotations, len - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


-------------------------------------
array : 
	input : 1 2 3 4 5 6 7 8 9 10 
	rotation :3 
	output :8 9 10 1 2 3 4 5 6 7 
	
	public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mid = arr.length / 2;
        rotate(arr, 2, 0, mid - 1);  // Rotate first half twice
        rotate(arr, 2, mid, arr.length - 1);  // Rotate second half twice
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void rotate(int[] arr, int rotations, int start, int end) {
        reverse(arr, start, end);
        reverse(arr, start, start + rotations - 1);
        reverse(arr, start + rotations, end);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


------------------------------------------------------------------
array :
	input :1 2 3 4 5 6 7 8 9 10 
	mid element 
	first part :input rotation :2 =>two times rotate 
	second part :second rotation :2 =>two times rotation 
	
	
	
	public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mid = arr.length / 2;
        rotate(arr, 2, 0, mid - 1);  // Rotate first half twice
        rotate(arr, 2, mid, arr.length - 1);  // Rotate second half twice
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void rotate(int[] arr, int rotations, int start, int end) {
        reverse(arr, start, end);
        reverse(arr, start, start + rotations - 1);
        reverse(arr, start + rotations, end);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

-------------------------------------------------------------------


