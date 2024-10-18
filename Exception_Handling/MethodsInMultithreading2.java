class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {

            }
            System.out.print(i + " ");
        }
    }
}

public class MethodsInMultithreading2 {
    public static void main(String[] args) {
        A p = new A();
        A k = new A();
        p.start();
        k.start();
    }
}
