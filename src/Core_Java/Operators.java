package Core_Java;

public class Operators {
    public static void main(String[] args) {
        // there are several types of operators


        // 1> Arithmetic Operators
        int a = 10;
        int b = 6;

        System.out.println("Addition::  "+(a+b));  // Addition
        System.out.println("Subtraction::  "+(a-b));  // Subtraction

        System.out.println("Multiplication::  "+a*b);  // Multiplication
        System.out.println("Division::  "+a/b);  // Division
        System.out.println("Modulus::  "+a%b);  // Modulus

        a++;
        System.out.println("Increment::  "+a);  // Increment
        b--;
        System.out.println("Decrement::  "+(b--));  // Decrement

        // 2> Relational Operators
        int x =10;
        int y = 5;
        System.out.println("Equals to :: "+( x == y));
        System.out.println("Not Equals to :: "+( x != y));

        System.out.println("Less than :: "+( x < y));
        System.out.println("Less than or equal to :: "+( x <= y));

        System.out.println("Greater than :: "+( x > y));
        System.out.println("Greater than or equals to :: "+( x >= y));

        // 3> Logical Operators
        boolean q = true;
        boolean r = false;

        System.out.println("Logical AND :: "+ (q && r));
        System.out.println("Logical OR :: "+ (q || r));
        System.out.println("Logical Not :: "+ !(q && r));

        // 4> Ternary Operator

        String W  = (a > b) ? "a is great" : "b is great" ;
        System.out.println(W);


        // 5> InstanceOf operator



        // 6> New Operator  7> Dot Operator

        Operators op = new Operators(); // new
        op.method(); // Dot




    }

    public void method() // Method in class
    {
        System.out.println("this is method class");
    }
}

