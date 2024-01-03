package Advance_Java;

import java.util.ArrayDeque;

public class CollectionArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(10);
        ad1.add(20);
        ad1.add(50);
        ad1.add(30);
        ad1.add(20);
        System.out.println(ad1);
    }
}
