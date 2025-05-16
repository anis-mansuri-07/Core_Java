package OOPs;


import Modifiers.DefaultClass;
import Modifiers.ProtectedClass;

abstract class Vehicle {
    public abstract void engine();

    void gas() {
        System.out.println("gas engine");
    }
}

class BMW extends Vehicle {

    @Override
    public void engine() {
        System.out.println("4000cc engine");
    }

    @Override
    void gas() {
        super.gas();
    }
}

class tata extends Vehicle {
    @Override
    public void engine() {
        System.out.println("2100cc engine");
    }

    @Override
    void gas() {
        super.gas();

    }
}

public class AbstractionDemo extends ProtectedClass {
    public static void main(String[] args) {

        Vehicle v = new BMW();
        v.engine();
        Vehicle v2 = new tata();
        v2.engine();
        v2.gas();
        AbstractionDemo a = new AbstractionDemo(); // from accessModifiers Package
        System.out.println(a.names);
        System.out.println("-------------------------------");
        DefaultClass d = new DefaultClass(); //public modifier  example
        d.Display();


    }
}
