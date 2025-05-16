package OOPs;

class City1 {
    public void m1(){
        System.out.println("Jaipur");
    }
}
class City {
    City1 city1;      // Constructore Create
    void m1(){
        System.out.println("Agra..");
        city1.m1();
    }
    City(City1 city1){
        this.city1=city1;

    }
}
public class ConstructoreCity {
    public static void main(String[] args) {
        City1 city1 = new City1();
        City city = new City(city1);
        city.m1();

    }
}
