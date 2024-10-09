public class CreateThread {
    public void run(){
    System.out.println("hello world");
    }
    public static void main(String[] args) {

        CreateThread t=new  CreateThread();
         t.run();
        
    }
    
}
