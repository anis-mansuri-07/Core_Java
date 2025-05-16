package sample;

import java.util.Scanner;

class sam {
    public int add(int a, int b) {
        return a + b;
    }
}

public class ProtoType {
    public static void main(String[] args) {
        //byte a = 10;
//
//        int b = 260;
//        byte a = (byte) b;
//        System.out.println(a);
        sam s = new sam();
        Scanner scanner = new Scanner(System.in);
        System.out.println(s.add(scanner.nextInt(), scanner.nextInt()));
    }
}
