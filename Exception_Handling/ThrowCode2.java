class A extends RuntimeException {
    A(String name) {
        System.out.println(name);
    }
}

class B {
    void hello() {
        int a = 8;
        if (a > 10) {
            throw new A("a is greater than");
        } else {
            System.out.println("a is less than 10 ");
        }
    }
}

public class ThrowCode2 {
    public static void main(String[] args) {
        B p = new B();
        p.hello();
    }
}