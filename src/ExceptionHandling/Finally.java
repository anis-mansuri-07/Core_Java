package ExceptionHandling;

class Final {
    int Fi() {
        try {
            int a = 10 / 0;
            System.out.println("Try");
            return 11;
            //return;  if here we write return statement then finally must execute
        } catch (Exception e) {
            System.out.println("Catch");

            System.exit(0);
            // if we write System Exit then it must return from that line and shut the jvm and also not return anything back
            return 222;

        } finally {
            //System.exit(0);  //
            System.out.println("Finally");
            return 33;
            // override and then return last updated value
        }

        // return 55;
    }
}

public class Finally {
    public static void main(String[] args) {
        Final fn = new Final();
        int x = fn.Fi();
        System.out.println(x);
    }
}
