import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("car");
        list.add("bike");
        list.add("car"); 
        list.add("bus");

        System.out.println("List: " + list);

        System.out.println("Element at index 1: " + list.get(1));

        
        System.out.println("Iterating over list:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}

