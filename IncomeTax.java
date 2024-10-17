import java.util.*;
public class IncomeTax {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any income:");
        int inco=sc.nextInt();

        if(inco<=10000){
            System.out.println("no tax");
        }
        else if( inco >10001 && inco <30000){
            System.out.println(inco + "10% tax is :" +inco *0.1);
        }
        else if(inco >30001 && inco <50000){
            System.out.println(inco +"20% tax is:" +inco *0.2);
        }
        else if( inco > 50000){
            System.out.println(inco +" 30% tax is" +inco *0.3);
        }


    }
    
}
