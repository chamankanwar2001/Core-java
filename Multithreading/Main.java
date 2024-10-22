class A{
    private int i;
    private float f;
    private char c;
    private short s;
    private long l;
    private boolean b;
    private String name;

    void setA(int i,float f,char c,short s,long l,boolean b,String name){
        this.i=i;
        this.f=f;
        this.c=c;
        this.s=s;
        this.l=l;
        this.b=b;
        this.name=name;
    }
    int getA(){
        return i;
    }
    float getA1(){
        return f;
    }
    char getA2(){
        return c;
    }
    short getA3(){
        return s;

    }
    long getA4(){
        return l;

    }
    boolean getA5(){
        return b;
    }
    String getA6(){
        return name;
    }
}
public class Main{
    public static void main(String[] args){
        A k=new A();
        k.setA(23,2.3,'c',345,3456,true,"name");
        System.out.println(k.getA());
        System.out.println(k.getA1());
        System.out.println(getA2());

    }
}
