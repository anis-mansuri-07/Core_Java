package YtCollection;

import java.util.Vector;

public class VectorMethod {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(20, 2);
        vector.add(10);
        vector.add(5);
        vector.add(9);
        System.out.println(vector.capacity());
        for (Integer integer : vector) {
            System.out.println(integer);
        }
        Vector<Integer> vector1 = new Vector<>(vector);

        System.out.println(vector1.hashCode() + " " + vector.hashCode());
        vector.add(55);
        System.out.println(vector);
        System.out.println(vector1);
    }
}
