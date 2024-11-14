public class StringBufferBasic {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("chaman");
        StringBuffer sb2=new StringBuffer("chaman");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
    }
    
}
