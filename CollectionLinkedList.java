package Advance_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(50);
        l1.add(30);
        l1.add(20);
        l1.add(0, 100);
        l1.add(0, 500);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(1);
        l2.add(7);
        l2.add(9);
//
//        l1.addAll(l2);
//        l1.addAll(3, l2);
//
////        l1.clear();
//
//        for(int i = 0; i < l1.size(); i++)
//            System.out.print(l1.get(i) + ", ");
//
//        System.out.println();
//
//        System.out.println(l1);
//
//        Object obj = l1.clone();
//        System.out.println(obj);
//
//        System.out.println(l1.contains(10));
//
//        LinkedList<Integer> l3 = new LinkedList<>();
////        l3.ensureCapacity(20);
//
//        System.out.println(l1.equals(l2));
//        System.out.println(l1.equals(obj));
//
//        System.out.println(l1.get(6));
//
//        System.out.println(l1.hashCode());
//        System.out.println(l2.hashCode());
//        System.out.println(l3.hashCode());
//        System.out.println(obj.hashCode());
//
//        System.out.println(l1.indexOf(1));
//        System.out.println(l1.lastIndexOf(1));
//
//        System.out.println(l1.isEmpty());
//        System.out.println(l3.isEmpty());
//
//        System.out.println(l1.iterator());
//        System.out.println(l2.iterator());
//        System.out.println(l3.iterator());
//
//
//        System.out.println(l1);
//        System.out.println(l1.remove(10));
//        System.out.println(l1);
//        System.out.println(l1.removeAll(l2));
//        System.out.println(l1);
//        System.out.println(l1.removeIf(e -> e > 100));
//        System.out.println(l1);
//
//        LinkedList<Integer> l4 = new LinkedList<>(Arrays.asList(10, 20, 30));
//        System.out.println(l1.retainAll(l4));
//        System.out.println(l1);
//
//        System.out.println(l1.set(1, 50));
//        System.out.println(l1);
//
//        System.out.println(l1.size());
//
//        System.out.println(l1.iterator());
//        System.out.println(l1.spliterator());
//
//        LinkedList<Integer> l5 = new LinkedList<>(l1.subList(1, 3));
//        System.out.println(l5);
//
//        System.out.println(Arrays.toString(l1.toArray()));
////        l1.trimToSize();


        System.out.println(l1);
        l1.addFirst(3000);
        l1.addLast(5000);
        System.out.println(l1);

        System.out.println(l1.iterator());
        System.out.println(l1.descendingIterator());
        System.out.println(l1.listIterator());


        System.out.println(l1.element());

        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());

        System.out.println(l1);
        System.out.println(l1.offer(7000));
        l1.offerFirst(9000);
        l1.offerLast(8000);
        System.out.println(l1);

        System.out.println(l1.peek());
        System.out.println(l1.peekFirst());
        System.out.println(l1.peekLast());

        System.out.println(l1);
        System.out.println(l1.poll());
        System.out.println(l1);
        System.out.println(l1.pollFirst());
        System.out.println(l1);
        System.out.println(l1.pollLast());
        System.out.println(l1);

        l1.add(3, 6000);
        System.out.println(l1);
        System.out.println(l1.pop());
        System.out.println(l1);

        l1.push(4000);
        System.out.println(l1);

        System.out.println(l1.removeFirst());
        System.out.println(l1);
        System.out.println(l1.removeLast());
        System.out.println(l1);

        l1.add(5, 10);
        System.out.println(l1);
        System.out.println(l1.removeFirstOccurrence(20));
        System.out.println(l1);
        System.out.println(l1.removeLastOccurrence(10));
        System.out.println(l1);
    }
}
