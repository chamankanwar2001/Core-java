import java.util.*;
public class ThreeNummax  {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number of a:");
        int a=sc.nextInt();

        System.out.println("enter number of b:");
        int b=sc.nextInt();

        System.out.println("enter number of c:");
        int c=sc.nextInt();

        if(a>=b){
            System.out.println("a is max");
        }
        if(b>=c){
            System.out.println("b is max");
        }
        else{
            System.out.println("c is max");
        }
  
    }

}
