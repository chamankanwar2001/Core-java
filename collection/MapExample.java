import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "John");
        hashMap.put(2, "Jane");
        System.out.println("HashMap: " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Banana");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Car");
        treeMap.put(1, "Bike");
        System.out.println("TreeMap: " + treeMap);
    }
}

