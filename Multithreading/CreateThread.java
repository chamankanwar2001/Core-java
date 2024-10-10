public class CreateThread {
    public CreateThread() {
    }
 
    public void run() {
       System.out.println("hello world");
    }
 
    public static void main(String[] var0) {
       CreateThread var1 = new CreateThread();
       var1.run();
    }
 }
 