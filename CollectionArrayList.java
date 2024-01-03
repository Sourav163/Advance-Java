package Advance_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(50);
        l1.add(30);
        l1.add(20);
        l1.add(0, 100);
        l1.add(0, 500);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(7);
        l2.add(9);

        l1.addAll(l2);
        l1.addAll(3, l2);

//        l1.clear();

        for(int i = 0; i < l1.size(); i++)
            System.out.print(l1.get(i) + ", ");

        System.out.println();

        System.out.println(l1);

        Object obj = l1.clone();
        System.out.println(obj);

        System.out.println(l1.contains(10));

        ArrayList<Integer> l3 = new ArrayList<>(15);
        l3.ensureCapacity(20);

        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(obj));

        System.out.println(l1.get(6));

        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(l3.hashCode());
        System.out.println(obj.hashCode());

        System.out.println(l1.indexOf(1));
        System.out.println(l1.lastIndexOf(1));

        System.out.println(l1.isEmpty());
        System.out.println(l3.isEmpty());

        System.out.println(l1.iterator());
        System.out.println(l2.iterator());
        System.out.println(l3.iterator());


        System.out.println(l1);
        System.out.println(l1.remove(10));
        System.out.println(l1);
        System.out.println(l1.removeAll(l2));
        System.out.println(l1);
        System.out.println(l1.removeIf(e -> e > 100));
        System.out.println(l1);

        ArrayList<Integer> l4 = new ArrayList<>(Arrays.asList(10, 20, 30));
        System.out.println(l1.retainAll(l4));
        System.out.println(l1);

        System.out.println(l1.set(1, 50));
        System.out.println(l1);

        System.out.println(l1.size());

        System.out.println(l1.iterator());
        System.out.println(l1.spliterator());

        ArrayList<Integer> l5 = new ArrayList<>(l1.subList(1, 3));
        System.out.println(l5);

        System.out.println(Arrays.toString(l1.toArray()));
        l1.trimToSize();
    }
}
