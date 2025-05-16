package ExceptionHandling;

public class Test1Exception {
    public static void main(String[] args) {
        System.out.println("Before try..");
        try {
            System.out.println("in try..");
            System.out.println(10 / 0);
            System.out.println("after try..");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // most usecase

            //System.out.println(e);
            System.out.println("In catch..");
        }

        System.out.println("After catch..");
    }
}
