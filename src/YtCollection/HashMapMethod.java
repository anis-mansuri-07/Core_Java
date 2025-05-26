package YtCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "Apple");
        map.put(2, "Mango");
        map.put(5, "PineApple");
        map.put(4, "WaterMelon");


        System.out.println(map.get(2));
        Set<Integer> keys = map.keySet();

        // output will be in ordered way of keys, means based on order on keys
        // you can put method key-set() on loop replacing set
        for (Integer i : keys) {
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        map.putIfAbsent(1, "Apple");
        System.out.println(map);
        map.replace(1, "Api");
        System.out.println(map);
        System.out.println(map.getOrDefault(55, "ss"));

/*
        this is for iterate over map and set get at map
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

*/


    }
}
