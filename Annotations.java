package Advance_Java;

import java.util.Date;

class Parent {
    public void greet() {
        System.out.println("Hello World");
    }
}

@Deprecated
class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Hello Earth");
    }
}

@FunctionalInterface
interface Student {
    public void age();
//    public void status();
}

public class Annotations {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Child c = new Child();
        c.greet();
    }
}
