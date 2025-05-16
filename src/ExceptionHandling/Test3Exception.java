package ExceptionHandling;

public class Test3Exception {
    public static void main(String[] args) {
        int i = 10;
        int[] arr = new int[5];
        arr[4] = 10;
        try {
            arr[2] = 10;
            throw new Exception("Tech Error...");
            //throw new Exception("Tech Error..."); you can also write this
            // is our own exception to throw to the user screen
        } catch (ArithmeticException e) {
            System.out.println("Arith");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Aiob");
            System.out.println(e.getMessage());
        } //catch (Exception e) {
        // System.out.println("Ex");
        // System.out.println(e.getMessage());
        // }
    }
}
