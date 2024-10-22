class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is sleeping");
            try {
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SleepMethod {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

