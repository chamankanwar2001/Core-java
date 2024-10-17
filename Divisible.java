import java.util.*;
public class Divisible {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("enter any num");
        int num=sc.nextInt();

        if (num %5==0 || num%11==0){
            System.out.println("divide");
        }
        else{
            System.out.println("not devide");
        }
    }
    
}
