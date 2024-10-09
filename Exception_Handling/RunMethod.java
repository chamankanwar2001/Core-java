class MyThread extends Thread{
    public void run(){
        for (int i=1;i<=4;i++){
            System.out.println("child class");
        }
    }
}
public class RunMethod {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.run();
        for(int i=1;i<=4;i++){
            System.out.println("parent thread");
        }
        
    }
    
}
