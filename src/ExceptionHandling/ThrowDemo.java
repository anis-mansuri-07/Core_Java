package ExceptionHandling;

import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) throws Exception {
        Scanner s1 = new Scanner(System.in);

        int i = 2;
        while (i < 5) {
            if (i % 2 == 0) {
                System.out.println("enter two number");
                int no1 = s1.nextInt();
                int no2 = s1.nextInt();
                if (no1 < 0 || no2 < 0)
                    throw new ArithmeticException("Number must be positive");
                // used as if else because we want to know that in which line has exception

                int c = no1 - no2;
                System.out.println("c = " + c);
            } else {
                System.out.println("odd number");
            }
            i++;
        }

    }
}
