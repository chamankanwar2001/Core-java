import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Front");
        arrayDeque.addFirst("New Front");
        arrayDeque.addLast("Back");
        System.out.println("ArrayDeque: " + arrayDeque);

        Deque<Integer> linkedDeque = new LinkedList<>();
        linkedDeque.add(1);
        linkedDeque.add(2);
        linkedDeque.add(3);
        System.out.println("LinkedList as Deque: " + linkedDeque);
    }
}

