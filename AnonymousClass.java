package Advance_Java;

interface Interface0 {
    public void meth1();
    public void meth2();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Interface0 obj = new Interface0() {
            @Override
            public void meth1() {
                System.out.println("I am meth1()");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth2()");
            }
        };
        obj.meth1();
        obj.meth2();
    }
}
