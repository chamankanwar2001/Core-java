import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator: " + iterator.next());
        }

        for (String item : list) {
            System.out.println("For-Each: " + item);
        }
    }
}
