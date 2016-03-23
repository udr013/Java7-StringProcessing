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

        //s.substring(2,5) = "NT-"
        //s.subSequence(s.indexOf("T"),s.lastIndexOf('N')) = "T-TE
        String newS = s.replace(s.substring(2,5),s.subSequence(s.indexOf("T"),s.lastIndexOf('N')));

        System.out.println(newS);// prints: RET-TETENT

        /**
         *  Making use of replaceAll(), replaceFirst()
         * */

        String t = "cat cup copp";
        // Note: replaceAll(String regex, String replacement)
        String newT = t.replaceAll("c.p\\B", "()");
        System.out.println(newT);
        // Note: replaceFirst(String regex, String replacement)
        newT = t.replaceFirst("c.p\\b", "()");
        System.out.println(newT);
        newT = t.replace(new StringBuilder("cat"),"()");
        System.out.println(newT);

    }
}
