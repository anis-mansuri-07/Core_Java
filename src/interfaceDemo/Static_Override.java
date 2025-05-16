package interfaceDemo;

class Parent {
    static void m1() {
        System.out.println("Parent");
    }

    protected void m2() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    static void m1() {
        System.out.println("Child");
    }

    @Override
    public void m2() {
        System.out.println("Child");
    }
}

public class Static_Override {
    public static void main(String[] args) {
        Parent p = new Child();
        p.m1(); // when parent method is static and child is overriding with the static keyword
//                  then its two different methods so it will not follow polymorphism
        p.m2();
    }
}
