package YtCollection;


import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        String s1 = new String("key");
        String s2 = new String("key");

        // in this case we check the Identity hashcode and == operator means reference/Memory location
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put(s1, 1);
        map.put(s2, 2);
        System.out.println(map);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

    }
}
