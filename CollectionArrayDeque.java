package Advance_Java;

import java.util.Arrays;
import java.util.ArrayDeque;


public class CollectionArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(10);
        ad1.add(20);
        ad1.add(50);
        ad1.add(30);
        ad1.add(20);
//        ad1.add(0, 100);
//        ad1.add(0, 500);

        ArrayDeque<Integer> ad2 = new ArrayDeque<>();
        ad2.add(1);
        ad2.add(7);
        ad2.add(9);

        ad1.addAll(ad2);
//        ad1.addAll(3, l2);

//        ad1.clear();

//        for(int i = 0; i < ad1.size(); i++)
//            System.out.print(ad1.get(i) + ", ");

        System.out.println();

        System.out.println(ad1);

        Object obj = ad1.clone();
        System.out.println(obj);

        System.out.println(ad1.contains(10));

        ArrayDeque<Integer> ad3 = new ArrayDeque<>();
//        l3.ensureCapacity(20);

        System.out.println(ad1.equals(ad2));
        System.out.println(ad1.equals(obj));

//        System.out.println(ad1.get(6));

        System.out.println(ad1.hashCode());
        System.out.println(ad2.hashCode());
        System.out.println(ad3.hashCode());
        System.out.println(obj.hashCode());

//        System.out.println(ad1.indexOf(1));
//        System.out.println(ad1.lastIndexOf(1));

        System.out.println(ad1.isEmpty());
        System.out.println(ad3.isEmpty());

        System.out.println(ad1.iterator());
        System.out.println(ad2.iterator());
        System.out.println(ad3.iterator());


        System.out.println(ad1);
        System.out.println(ad1.remove(10));
        System.out.println(ad1);
        System.out.println(ad1.removeAll(ad2));
        System.out.println(ad1);
        System.out.println(ad1.removeIf(e -> e > 100));
        System.out.println(ad1);

        ArrayDeque<Integer> ad4 = new ArrayDeque<>(Arrays.asList(10, 20, 30));
        System.out.println(ad1.retainAll(ad4));
        System.out.println(ad1);

//        System.out.println(ad1.set(1, 50));
        System.out.println(ad1);

        System.out.println(ad1.size());

        System.out.println(ad1.iterator());
        System.out.println(ad1.spliterator());

//        ArrayDeque<Integer> l5 = new ArrayDeque<>(ad1.subList(1, 3));
//        System.out.println(l5);

        System.out.println(Arrays.toString(ad1.toArray()));
//        ad1.trimToSize();


        System.out.println(ad1);
        ad1.addFirst(3000);
        ad1.addLast(5000);
        System.out.println(ad1);

        System.out.println(ad1.iterator());
        System.out.println(ad1.descendingIterator());
//        System.out.println(ad1.listIterator());


        System.out.println(ad1.element());

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

        System.out.println(ad1);
        System.out.println(ad1.offer(7000));
        ad1.offerFirst(9000);
        ad1.offerLast(8000);
        System.out.println(ad1);

        System.out.println(ad1.peek());
        System.out.println(ad1.peekFirst());
        System.out.println(ad1.peekLast());

        System.out.println(ad1);
        System.out.println(ad1.poll());
        System.out.println(ad1);
        System.out.println(ad1.pollFirst());
        System.out.println(ad1);
        System.out.println(ad1.pollLast());
        System.out.println(ad1);

//        ad1.add(3, 6000);
        System.out.println(ad1);
        System.out.println(ad1.pop());
        System.out.println(ad1);

        ad1.push(4000);
        System.out.println(ad1);

        System.out.println(ad1.removeFirst());
        System.out.println(ad1);
        System.out.println(ad1.removeLast());
        System.out.println(ad1);

//        ad1.add(5, 10);
        System.out.println(ad1);
        System.out.println(ad1.removeFirstOccurrence(20));
        System.out.println(ad1);
        System.out.println(ad1.removeLastOccurrence(10));
        System.out.println(ad1);


        System.out.println(ad1.element());
        System.out.println(ad1);
    }
}
