package OOPs;

//  class inherited prop and func one by one
//Hierarchical Inheritance: -   Super class inherited by every sub class


class DADA{
    void Blood(){
        System.out.println("I am your dada..");
    }
}

class dad extends DADA{

}

class son extends dad{

}
public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        son a = new son();
        a.Blood();
    }

}
