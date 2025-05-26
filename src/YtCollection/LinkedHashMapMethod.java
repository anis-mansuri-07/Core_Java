package YtCollection;

import java.util.LinkedHashMap;

public class LinkedHashMapMethod {


    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hashmap = new LinkedHashMap<>(3, 0.3f, false);
        // uses double linked list to maintain order
        // you can give capacity, load-factor, access-order
        // access - order by default false,
        // if true then last used elements get last position

        hashmap.put("WaterMelon", 50);
        hashmap.put("Guava", 70);
        hashmap.put("Orange", 30);
        hashmap.put("Apple", 100);
        hashmap.get("Guava");
        System.out.println(hashmap);


        // Looping and getter setter of value and key
       /*
        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
        */
    }
}
