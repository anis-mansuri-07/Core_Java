package YtCollection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list = new ArrayList<>();    you can also create like this
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.set(1, 300);
//        System.out.println(list);
//        Integer[] arr = {200, 300, 500, 700};
//        List<Integer> list2 = Arrays.asList(arr);


//        list.remove(2);
//        list.add(4, 100);  //index based
        System.out.println(list);

//        List<Integer> integers = List.of(10, 20, 23, 33, 63);
//        list.addAll(integers);
//        System.out.println(list);
//
//        Integer[] array = list.toArray(new Integer[0]);
//        for (Integer i : array) {
//            System.out.print(i + ", ");
//        }


//        list.sort(null);
        Collections.sort(list);
        System.out.println(list);

    }
}
