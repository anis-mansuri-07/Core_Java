package YtCollection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Apple");
        map.put(2, "Ap");
        map.put(5, "Via_Apple");
        map.put(3, "PineApple");
        System.out.println(map);
        System.out.println(map.lowerEntry(2));
        System.out.println(map.ceilingEntry(4));
        System.out.println(map.descendingMap());
        System.out.println(map.floorEntry(4));
//        System.out.println(map.pollFirstEntry());  this will delete the first key value
        System.out.println(map.reversed());
        System.out.println(map);
        System.out.println(map.navigableKeySet());
    }
}
