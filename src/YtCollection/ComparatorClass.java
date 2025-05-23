package YtCollection;

import java.util.ArrayList;
import java.util.Comparator;

class StringLenghtComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer s1, Integer s2) {
        return s2 - s1;
        // Ascending means S1 should come first and Descending means S2 should come first
    }
}

public class ComparatorClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(600);
        list.add(20);
        list.add(200);
        list.add(30);
        list.add(500);
        System.out.println(list);


        // with lambda expression
        list.sort((a, b) -> b - a);
        //if you want to compare length then use length() method and go

        // this is how sort written and works with compare method of Comparator interface
        list.sort(new StringLenghtComparator());

        System.out.println(list);

    }
}
