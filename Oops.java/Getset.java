class A{
    private int a;
    private String name;

    void setA(int a, String name){
        this.a=a;
        this.name=name;
    }

    int getA(){
        return a;
    }
    String getA1(){
        return name;
    }

}
public class Getset{
    public static void main(String[] args){
        A k=new A();
        k.setA(7,"rahat");
        System.out.println(k.getA());
        System.out.println(k.getA1());


    }
}