package OOPs;

// A method with same name as class is called constructor //

class Animal2{

    public void Cat(String cat){
        System.out.println("Cat Method...");
        System.out.println(cat);
    }
}

class Animal{

    String name2 ; // 111
    //names2 cat;
    //names a2;

    public void Dog(){
        //a2.Cat(name2);
        System.out.println("Dog Method Call Using Object");
        System.out.println(name2); // OP: Anis
    }

    Animal(String name){ // Constructor

        System.out.println("names2 Constructor..Direct Call....");
        System.out.println(name); // null
        //this.cat = a2;
        this.name2 = name; // Assign String Value to another String in Class     111


    }
}
public class Constructor {
    public static void main(String[] args) {
        //names a2 = new names();

        System.out.println("Main Class..");
        Animal An = new Animal("Anis"); // Sending String value through constructor
        // names2 is class && new is keyword && last names2 is constructor which is called directly in class && "An" is reference object of constructor
        An.Dog();
        // Call method using reference object "An"

    }
}
