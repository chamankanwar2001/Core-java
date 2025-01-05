import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.addLast("Last");
        list.addFirst("New First");
        System.out.println("LinkedList: " + list);
    }
}
