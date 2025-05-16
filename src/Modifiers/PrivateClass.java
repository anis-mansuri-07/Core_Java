package Modifiers;

class PrivateModifier {
    private int i = 10;


    public void setI(int i) {
        this.i = i;
    }


    public void numbers() {
        System.out.println(i);
    }
}

public class PrivateClass {
    public static void main(String[] args) {
        PrivateModifier p = new PrivateModifier();
        p.setI(15);
        p.numbers();
        ProtectedClass p2 = new ProtectedClass();
        p2.display();


    }
}
