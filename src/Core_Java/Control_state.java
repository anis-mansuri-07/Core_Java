package Core_Java;

public class Control_state {
    public static void main(String[] args) {
        int x = 6, y = 2;


        // simple if state..
        if (x > y) {
            System.out.println(x);
        }


        // if_else state..
        if (x > y) {
            System.out.println("if state..");
        } else {
            System.out.println("Else state");
        }


        // nested if_else state..
        if (!(x == 6)) {

            System.out.println("if state..");
            if (x > y) {
                System.out.println(x);
            }
        } else {
            System.out.println("else state..");
        }


        // if_else_if state
        // switch state..
        switch (6) {
            case 1:
                System.out.println("yes");
                break;
            case 6:
                System.out.println("no.");
                break;
        }
    }

}
