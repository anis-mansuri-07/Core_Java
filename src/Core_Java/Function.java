package Core_Java;

class news{

    int sum(int a,int b)    // with parameter
    {
        int c;
        c = a+b;
        return c;
    }
    void s()               // with parameter
    {
        System.out.println("i am s method");
    }
}
public class Function {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        news sc = new news();    // creating obj
        int u = sc.sum(a,b);    // call func with parameter
        System.out.println(u);
        sc.s();                 // call without parameter

    }
}
