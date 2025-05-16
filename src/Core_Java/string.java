package Core_Java;


public class string {
    public static void main(java.lang.String[] args) {
        String s3 = "mca";
        String s1 = new String("mca");
        String s2 = new String("mca");

        String s4 = "mca";
        System.out.println(s4 == s3);// reference compare
        System.out.println(s1.equals(s2));// content compare


        String a = s3 + "yaaa";
        System.out.println(a);
        StringBuffer b = new StringBuffer("Anis mansuri");
        b.append("anisaaaaaaa");
        System.out.println(b);


        char arr[] = {'a', 's', 'e'};

        String s = new String(arr);
        System.out.println(s);

    }
}
