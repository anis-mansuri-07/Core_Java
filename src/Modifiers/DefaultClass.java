package Modifiers;

class DefaultDemo {
    void sum() {
        System.out.println("This is the sum method of Default class..");
    }
}

public class DefaultClass {
    public void Display() {
        ProtectedClass n = new ProtectedClass();
        n.display();
        System.out.println(n.names);

    }

    public static void main(String[] args) {
        ProtectedClass n = new ProtectedClass();
        n.display();
        System.out.println(n.names);
    }
}
