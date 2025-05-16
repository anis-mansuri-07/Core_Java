package ExceptionHandling;

public class Test4Exception {
    public static void main(String[] args) {
        int[] arr = new int[7];
        for (int i : arr)
            arr[i] = i;
        try {
            int a = 5 / 0;
            System.out.println(a);// it creates default own object and throw to the catch block
            throw new ArrayIndexOutOfBoundsException("Yes"); // if no exception occur then this will execute and print

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());//catch both objects and print behalf of object which caught by catch block

        }
    }
}

