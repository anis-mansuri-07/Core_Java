package Core_Java;

public class Loops_state{
    public static void main(String[] args) {
        int[] arr = new int[5];
        int i;
        // for loop
        for ( i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

        // while loop
        while (i!=10){
            System.out.println(i);
            i++;
        }

        // Do_while loop
        do{
            System.out.println(i);

        }while (false);

        // nested for loop
        int q = 5;
        for (int x = 0; x < 5; x++) {

            for (int k = 0; k < q; k++) {
                System.out.print(" ");
            }
            q = q - 1;
            for (int j = 0; j <= x; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        // for each loop
        int[] br= {1,2,3};
        for(int data:br) System.out.println(data);


    }


}
