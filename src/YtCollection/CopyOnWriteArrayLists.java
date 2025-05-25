package YtCollection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayLists {

    public static void main(String[] args) {
        /*
         read from og and write on copy of the list
         when read are max and write are minimal
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(10);
                arrayList.add(20);
                arrayList.add(30);
                arrayList.add(40);
                arrayList.add(50);
                for (Integer i : arrayList) {
                    System.out.println(i);
                    if (i.equals(30)) {
                        arrayList.add(60);
                    }
                // this will throw exception because of the change while reading
                }
        */

        CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>();
        copy.add(10);
        copy.add(20);
        copy.add(30);
        copy.add(40);
        for (Integer i : copy) {
            System.out.println(i);
            if (i.equals(10)) {
                copy.add(60);
            }
        }
        System.out.println(copy);
    }
}
