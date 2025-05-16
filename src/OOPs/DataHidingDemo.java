package OOPs;

class ATM {
    private String username;
    private String pass;
    private int bal;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }
}


public class DataHidingDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.setBal(1000);
        atm.setPass("123");
        atm.setUsername("Anis");


        System.out.println(atm.getBal());
        System.out.println(atm.getPass());
        System.out.println(atm.getUsername());
    }
}
