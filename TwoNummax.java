import java.util.*;
public class TwoNummax {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        System.out.println("enter b number:");
        int b=sc.nextInt();

        if (a>b){
            System.out.println("a is max");
        }
        else{
            System.out.println("b is max");
        }

    }
}
