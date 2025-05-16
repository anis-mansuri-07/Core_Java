package Core_Java;

public class String_Buffer {
    public static void main(String[] args) {
       StringBuffer sb = new StringBuffer("anis");
       StringBuffer sb2 = sb.append("mansuri");
       System.out.println(sb==sb2);  // same memory location change while String creates separate memory location
//        StringBuffer and their all methods

        StringBuilder s = new StringBuilder("annu");
        System.out.println(s);

    }
}
