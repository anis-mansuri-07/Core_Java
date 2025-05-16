package Collections;

import java.util.*;

public class ListEx {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println("Enter Index For Remove");
        int index = sc.nextInt();
        if (index <= list.size() - 1) {
            list.remove(index);
            System.out.println("List : " + list);
        } else {
            System.out.println("Index Out Of Bound...");
        }

        System.out.println("Enter Element For Find");
        index = sc.nextInt();
        if (list.contains(index)) {
            System.out.println("Found it..");
        } else {
            System.out.println("Not Found..");
        }
    }
}
