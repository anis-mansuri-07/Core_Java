package ExceptionHandling;
class TestCase{

    void display1(){
        display2();
        System.out.println("Display  1 ... ");
    }
    void display2(){
        display3();
        System.out.println("Display  2 ... ");
    }
    void display3(){
        try{
            display4();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Display  3 ... ");
    }
    void display4(){
        int x = 10/0;
        System.out.println("Display  4 ... ");
    }

}
public class Test2Exception {
    public static void main(String[] args) {
        TestCase tc = new TestCase();
        tc.display1();
    }
}
