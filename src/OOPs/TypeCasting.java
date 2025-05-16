package OOPs;


class n1 {
    n1() {

        System.out.println("i am super class and i want to change my name to the new name");
    }
}

class name extends n1 {
    static int names = 10; //this is static data type which is only used on instance variable

    name() {
        super();

        System.out.println("this is constructor and i want to change it with my Narrative");
        System.out.println(names);
        names = names + 10;
        System.out.println(names);
    }

}


public class TypeCasting {

    public static void main(String[] args) {

        int a = 7;
        short b = 8;
        b = (short) a; // in this way you have to write data type before converting the data
        a = b; //this is correct for short to int
        System.out.println(name.names);

        System.out.println(a + " " + b);
        char x = 'A';
        int y = (int) x;
        System.out.println(y);
        name n = new name();
        System.out.println(name.names);


    }

}
