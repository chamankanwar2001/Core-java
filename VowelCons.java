import java.util.*;
public class VowelCons {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter any character");
        char ch=sc.next().charAt(0);

        if(ch == 'a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
            System.out.println("this is vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
    
}
