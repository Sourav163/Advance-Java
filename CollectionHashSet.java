package Advance_Java;

import java.util.Arrays;
import java.util.HashSet;

public class CollectionHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(10);
        hs1.add(20);
        hs1.add(50);
        hs1.add(30);
        hs1.add(20);
        System.out.println(hs1);

        HashSet<Integer> hs2 = new HashSet<>(15);
        hs2.add(100);
        hs2.add(200);
        hs2.add(500);
        hs2.add(300);
        hs2.add(200);
        System.out.println(hs2);

        HashSet<Integer> hs3 = new HashSet<>(15, 5);
        hs3.add(1000);
        hs3.add(2000);
        hs3.add(5000);
        hs3.add(3000);
        hs3.add(2000);
        System.out.println(hs3);

//        hs1.clear();
//        System.out.println(hs1);

        Object obj = hs1.clone();
        System.out.println(obj);

        System.out.println(hs1.contains(10));

        System.out.println(hs1.isEmpty());

        System.out.println(hs1.iterator());
        System.out.println(hs1.spliterator());

        System.out.println(hs1);
        System.out.println(hs1.remove(10));
        System.out.println(hs1);

        System.out.println(hs1.size());

        System.out.println(Arrays.toString(hs1.toArray()));
    }
}
