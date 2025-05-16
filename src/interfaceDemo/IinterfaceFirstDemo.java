package interfaceDemo;

interface IinterfaceFirstDemo {
    String i_One();

    String i_Two(String one, String Two);
}

class Inter_Face implements IinterfaceFirstDemo {

    @Override
    public String i_One() {
        return "I am I_One Method";
    }

    @Override
    public String i_Two(String one, String Two) {
        return "I am I_Two Method";
    }
}

class Inter {
    public static void main(String[] args) {
        IinterfaceFirstDemo i1 = new Inter_Face();
        System.out.println(i1.i_One() + " \n " + i1.i_Two("Anis", "Mansuri"));
    }
}
