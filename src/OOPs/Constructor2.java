package OOPs;

// A method with same name as class is called constructor //

class names {

    public void color(){
        System.out.println("red");
    }
}

class names2 {

    names a1;
    public void Dog(){
        System.out.println("Dogs..");
        a1.color();

    }

    names2(names g1){ // Constructor
        this.a1=g1;   //using method and put value in object of names class
        System.out.println("names2 Constructor..Direct Call....");


    }
}
public class Constructor2 {
    public static void main(String[] args) {

        names a1 = new names();
        a1.color();
        System.out.println("Main..");
        names2 n = new names2(a1);
        n.Dog();

    }
}
