package Core_Java;
import java.lang.String;

public class String_methods {
    public static void main(String[] args) {
        String s1 = "Mansurianis";
        String s2 = "Anis";
        System.out.println(s1.length());  // print length of that String in value
        System.out.println(s1.charAt(0)); // print every String at that index
        System.out.println(s1.concat(" " + s2)); // join both String into one you can use + for this
        System.out.println(s1 + s2); // concat using + operator
        System.out.println(s1.compareTo(s2)); // s1 > s2 if s1 length is more than +
        System.out.println(s1.contains("Mansuri")); // to check if words is there or not
        System.out.println(s1.indexOf('i')); // index of that char returns
        System.out.println(s1.lastIndexOf('i')); // returns last index from that String


        // other method I have to find
    }
}