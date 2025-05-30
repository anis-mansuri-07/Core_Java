package YtCollection;

import java.util.*;

class SortDemo {
    private int num;
    private String name;

    public SortDemo(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SortDemo{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}

public class SortedMapDemo {
    public static void main(String[] args) {

        SortedMap<String, Integer> map = new TreeMap<>(String::compareTo);
//        SortedMap<String, Integer> map = new TreeMap<>(Comparator.reverseOrder()); for reverse
        map.put("Tree", 25);
        map.put("Guava", 66);
        map.put("Apple", 90);
        map.put("Design", 1);
        map.put("Ema", 1);

        System.out.println(map);
        System.out.println("First Key :" + map.firstKey());
        System.out.println("Last Key :" + map.lastKey());
        System.out.println(map.headMap("G")); // exclude "G"
        System.out.println(map.tailMap("G")); // include "G"
        System.out.println("Sub map : " + map.subMap("B", "E")); // exclude E




/*
        SortedMap<SortDemo, Integer> map1 = new TreeMap<>();
        SortDemo s1 = new SortDemo(1, "App");
        SortDemo s2 = new SortDemo(2, "Apple");
        SortDemo s3 = new SortDemo(3, "Demo");

        map1.put(s1, 1);
        map1.put(s2, 2);
        map1.put(s3, 3);
        System.out.println(map1);
*/

    }
}
