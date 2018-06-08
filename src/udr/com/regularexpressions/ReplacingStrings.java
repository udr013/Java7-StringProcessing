package udr.com.regularexpressions;

/**
 * Created by udr013 on 22-3-2016.
 */
public class ReplacingStrings {
    public static void main(String[] args) {

        /**
         *  Making use of replace()
         */

        String  s  = "RENT-TENT";
        System.out.println(s.substring(2,5)); // "NT-"
        System.out.println(s.subSequence(2,5)); // "NT-"
        System.out.println(s.subSequence(s.indexOf("T"),s.lastIndexOf('N'))); // "T-TE
        String newS = s.replace(s.substring(2,5),s.subSequence(s.indexOf("T"),s.lastIndexOf('N')));

        System.out.println(newS);// prints: RET-TETENT

        /**
         *  Making use of replaceAll(), replaceFirst()
         * */

        String t = "cat cup copp";
        String newT = t.replaceAll("c.\\B", "()");
        System.out.println(newT); // ()t ()p ()pp

        newT = t.replaceFirst(".p\\b", "()");
        System.out.println(newT); // cat c() copp

        newT = t.replace(new StringBuilder("cat"),"()");
        System.out.println(newT); // () cup copp
    }
}
