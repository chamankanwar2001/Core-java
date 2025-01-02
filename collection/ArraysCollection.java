import java.util.*;
public class ArraysCollection {
    
    public static void main(String[] args) {
        List<String> data = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> countMap = new HashMap<>();
        for (String item : data) {
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }

        System.out.println("Count of elements:");
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String mostCommon = Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nMost common element: " + mostCommon);

        List<String> newData = Arrays.asList("banana", "grape", "apple");
        for (String item : newData) {
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }

        System.out.println("\nUpdated counts:");
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

    

