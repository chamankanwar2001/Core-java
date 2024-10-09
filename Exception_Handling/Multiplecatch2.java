public class Multiplecatch2 {
    public static void main(String[] args) {
        try{
            int a=9/0;
            System.out.println(a);
        }
        catch(Exception ex){
            System.out.println("exception class");
        }
        catch(ArithmeticException ex){
            System.out.println("ArithmeticException");
        }
    }
    // this code is error code
}
