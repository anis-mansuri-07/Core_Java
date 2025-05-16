package OOPs;

class car {                 // class number 1
    int a = 5;

    public void horn1() {  // class 1 method

        System.out.println("horn please..");
    }
}

class cree extends car {      // class 2 creates and extends class 1

    public void horn() {     // class 2 method
        System.out.println("pepe class..");
        //car p = new car();  // class 1 object
        //p.horn();           // obj to method call
    }

    void dis() {
        System.out.println("Dis method");
    }


}

class jay {
    void namessss() {
        System.out.println("In the jay");
    }
}


public class Inheritance {    // main class
    public static void main(String[] args) {
        cree c = new cree();      // class 2 obj
        c.horn();                 // class 2 obj
        // System.out.println(c.a);  // obj to value call
        //  car c1 = new cree();      // Reference == obj && Child ch = new Parent(); Not Possible
        //c1.horn1();
        car c2 = new car();
        c2.horn1();

        car cn = new cree();
        //car cn = new car();


    }

}
