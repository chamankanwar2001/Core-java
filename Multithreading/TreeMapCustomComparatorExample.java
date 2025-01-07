import java.util.*;

public class TreeMapCustomComparatorExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>((a, b) -> b - a);
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        System.out.println("TreeMap with Custom Comparator: " + treeMap);
    }
}
