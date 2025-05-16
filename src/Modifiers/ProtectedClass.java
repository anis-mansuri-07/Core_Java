package Modifiers;

public class ProtectedClass {
    protected String names = "Hello";

    protected void display() {

        System.out.println("hello Anish.\ni am from Modasa\nProtected Display");
    }
}


class Test1 {
    public static void main(String[] args) {
        ProtectedClass Name = new ProtectedClass();
        Name.display();
        System.out.println(Name.names);
        DefaultDemo d = new DefaultDemo();
        d.sum();
        System.out.println(d.hashCode());

    }
}
