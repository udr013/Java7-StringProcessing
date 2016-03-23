/**
 * Created by udr013 on 22-3-2016.
 */
public class OtherStringMethods {
    public static void main(String[] args) {
        String str = "Start startup, time to start";

        /**
         * These methods don't apply to stringBuilder ! explicit cast needed
         * */

        System.out.println(str.startsWith("Sta"));
        System.out.println(str.startsWith("Sta",0));
        System.out.println(str.startsWith("Sta",2));
        System.out.println(str.startsWith("Sta",-3));

        System.out.println(str.endsWith("Sta"));


        System.out.println(str.substring(0,1).compareTo(str.substring(6,7))); //prints -32




        String a = "ABC";
        String b = "ACB";

        int e = 'A'+'B'+'C';
        int f = 'x'+'w'+'p';


        System.out.println(a.compareTo(b)); // prints -55

        // prints: int of string a:198 int of Sting b: 351 = -153
        System.out.println("int of string a:"+ e + " int of Sting b: "+f +" = "+(e-f) );
        System.out.println(a.compareToIgnoreCase(b)); // prints -23

        StringBuilder c = new StringBuilder("A");
        StringBuilder d = new StringBuilder("A");

        System.out.println(c.toString().compareTo(d.toString())); // also prints 0

        /**
         * equals()
         */

        System.out.println(a.equals(b)); //returns false
        System.out.println(a.equalsIgnoreCase(b)); //returns true

        System.out.println(c.equals(d)); // returns false for stringBuilder
        System.out.println(a.equals(c)); // returns false for stringBuilder




    }

}
