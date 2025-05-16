package ExceptionHandling;

import java.util.Scanner;

class NewException extends Exception{

    public NewException(String ne){
        super(ne);
    }


}


public class Custom_Exception {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            if ((a % b) == 2) {
                throw new NewException("This ");
            } else {
                throw new NewException("Value 10");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
