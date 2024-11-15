public class StringBuilderConstructer {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        String s= new String (sb);
        System.out.println(s);
    }
    
}
