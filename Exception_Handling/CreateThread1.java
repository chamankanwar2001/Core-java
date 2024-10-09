//normal convert thread class then used thread class extends 
public class CreateThread1 {
    // createthread class convert into thred class using extending thread class
    // run method
    
        public void run(){
        System.out.println("hello world");
        }
        public static void main(String[] args) {
            // createthread class inactive stage
            // want to convert inactive stage in to active stage using start method
    
            CreateThread1 t=new CreateThread1();
            // thread class inactive stage convert into active stage
             t.run();
            
        }
        
    }
    
