package udr.com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by udr013 on 21-3-2016.
 */
public class Qualifiers {
    public static void main(String[] args) {
        String testString = "what are the colours of the leaves in fall, or the color of the ball we all play with?";
        /**
         *  * - find 0 or many
         *  ? - find 0 or 1
         *  + - one or more
         * */

        String regex = "colou+r"; //colou+r
        //String regex = "f?all";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testString);

        //while (matcher.find())
        //System.out.println(matcher.group());

        String newString = matcher.replaceAll("color");
        System.out.println(newString);
    }
}
