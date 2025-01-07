import java.util.concurrent.*;

public class BlockingQueueExample {
    public static void main(String[] args) 
    throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
        queue.put("A");
        queue.put("B");
        System.out.println("BlockingQueue: " + queue);
    }
}
