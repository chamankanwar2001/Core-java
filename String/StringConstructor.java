public class StringConstructor {
    public static void main(String[] args){
    // STRING CONSTRUCTOR 

// 1 Default Constructor

    
        String s=new String();
        System.out.println(s);
    }
}

// 2  Literal Constructor 
public class Main2{
    public static void main(String[] args){
        String s=new String("chaman");
        System.out.println(s);
    }
}

// 3 StringBuilder Constructor
public class Main3{
    public static void main(String[] args){

        StringBuilder sb=new StringBuilder("hello");
        String s=new String(sb);
        System.out.println(s);
        
    }
}

// 4 StringBuffer Constructor
public class Main4{
    public static void main(String[] args){

        StringBuffer sb=new StringBuffer("chaman");
        String s=new String (sb);
        System.out.println(s);
    }  
}
    
// 5 String chat array Constructor

public class Main5{
    public static void main(String[] args){
        // String s=new String (char[] c);
        char c[]= {'c','h','a','m'};
        String s=new String(c);
        System.out.println(s);
        
    }
}

// 6 String byte array Constructor

public class Main6{
    public static void main(String[] args){
        byte b[] = {23,45,6,78,};
        String s=new String(b);
        System.out.println(s);
    }
}
    

