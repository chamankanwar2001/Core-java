class A extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(2000);
            } catch (Exception ex) {
            }
            System.out.print(i + " ");
        }

    }
}

public class MethodsInMultithreading3 {
    public static void main(String[] args) {
        A p = new A();
        A k = new A();

        p.start();
        try {
            p.join();
        } catch (InterruptedException ex) {
        }
        k.start();
    }
}