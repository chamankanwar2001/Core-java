import java.util.*;

public class CollectionsUtilityExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 8, 1);
        System.out.println("Original: " + list);

        // Sorting
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        // Reverse
        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        // Max & Min
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
    }
}
