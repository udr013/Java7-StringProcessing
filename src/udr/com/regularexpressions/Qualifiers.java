package src.udr.com.regularexpressions;

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

//        String regex = "colou+r"; //colou+r
        String regex = "[bf]?all";

        Pattern pattern = Pattern.compile("[bf]?all");
        Matcher matcher = pattern.matcher(testString);
        System.out.println("matcher: " + matcher); // matcher: java.util.regex.Matcher[pattern=[bf]?all region=0,86 lastmatch=]

        while (matcher.find()) {
            System.out.println(" found: " + matcher.group()); //actually the result it found.
            System.out.println("started at: " + matcher.start()); // index in the char array where it starts
            System.out.println("to: " + matcher.end()); //index in the char array after the last char of the match aka to
        }

        String newString = matcher.replaceAll("color");
        System.out.println(newString);
    }
}
