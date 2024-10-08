
public class Fourthm{

    int add(){
        int a= 4;
        int b=3;
        int result=a+b;
        System.out.println( "addition :"+ result);
        return result;


    }
    int div(){
        int a= 4;
        int b=3;
        int result=a/b;
        System.out.println( "divide :"+ result);
        return result;


    }
    int multi(){
        int a= 4;
        int b=3;
        int result=a*b;
        System.out.println( "multi :"+ result);
        return result;


    }
    int sub(){
        int a= 8;
        int b=3;
        int result=a-b;
        System.out.println( "sub  :"+ result);
        return result;


    }
    int mod(){
        int a= 4;
        int b=3;
        int result=a%b;
        System.out.println( "modular :"+ result);
        return result;


    }
    public static void main(String[] args){
        Fourthm k=new Fourthm();
        k.add();
        k.div();
        k.sub();
        k.multi();
        k.div();
        k.mod();




    }
}