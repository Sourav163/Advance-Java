package Advance_Java;

import java.util.ArrayList;

class Generic<Type1, Type2> {
    Type1 t1;
    Type2 t2;
    public Generic(Type1 t1, Type2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
}

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(50);
        System.out.println(al);

        int element = al.get(1);
        System.out.println(element);

        Generic<Integer, String> g = new Generic<>(170, "Sourav");
        System.out.println(g.t1 + " " + g.t2);
    }
}
