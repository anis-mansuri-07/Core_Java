package Generics;


public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Generics");
        Generic<String> g = new Generic<>();
        g.setObj("Generics-Class");
        System.out.println(g.getObj() + "\n");

        System.out.println("Generic With Key Value Pair");
        KeyValue<Integer, String> kv = new KeyValue<>(1, "Java");
        System.out.println(kv.getKey() + "   " + kv.getValue() + "\n");

        System.out.println("This is Parent Child Interface Generics");
        Parent_Interface<String> name = new Child_Class<>();
        name.setName("Hello Java");
        System.out.println(name.getName());

    }
}
