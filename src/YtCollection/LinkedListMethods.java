package YtCollection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(253);
        linkedList.add(20);
        linkedList.add(51);

        linkedList.addLast(55);
        linkedList.addFirst(0);
        System.out.println("Main");
        System.out.println(linkedList);
        System.out.println("After Lambda");
        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);
        LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(10, 55, 50));
        linkedList.removeAll(linkedList1);
        System.out.println("After Remove LL");
        System.out.println(linkedList);

    }
}
