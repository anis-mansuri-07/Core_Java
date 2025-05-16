package ExceptionHandling;

import java.io.*;


class ThrowTest {

    void d1() throws IOException {
        d2();

    }

    void d2() throws IOException {

        //this is called Checked Exception which must have to catch
        BufferedReader b = new BufferedReader(new FileReader("D/SparkJava")); // we must have to catch this exception through try catch
        b.close();
    }


}

public class ThrowsDemo {
    public static void main(String[] args) {
        //public static void main(String[] args) throws Exception || you can do this or use try catch in main method
        ThrowTest tt = new ThrowTest();

        try {
            tt.d1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

