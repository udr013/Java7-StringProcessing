package udr.com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by udr013 on 21-3-2016.
 */
public class UseRegex {
    public static void main(String[] args) {

        int counter = 0;

        String targetString = "i am\r finer to dine at nine,  ie \n21:00 \n(at the dinner)\t while drink wine of a red color\f";

        /**
         * look for match of: range d to f or  an 'n' +ine
         * when using ^ it will exclude all CharSequence matching the d-fn
         * */
        // String regex = "[^d-fn]ine";


        /**
         * find CharSequence matching i + with one char in between (.) + e
         * */
        String regex = "\\Bi.e";

        /**
         * other character classes
         *  \d - find digits
         *  \D - find nonDigits
         *  \s - find whitespace characters like: space, \t(tab), \n, \f, \r, x0B
         *  \S - find  non whitespace
         *  \w - find word characters (a to Z 0 to 9)
         *  \W - find non word character ( ^\w )
         */

        /**
         * Boundary constructs
         *
         * \b  find at a word boundary
         * \B find at a non word boundary
         * ^ at the beginning of a line
         * $ at the end of a line
         * */

        String regex2 = "$\\b";

        /**
         * Pattern hasn't a public constructor it needs to be instantiated by using factory method compile()
         * compile compiles it into a Pattern object.
         * Matcher is instantiated using matcher(), it also doesn't have a public constructor.
         * It's an engine that interprets a Pattern object and matches it agains a CharSequence
         * */
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(targetString);

        //find returns true as long as it finds more matches
        while (matcher.find()) {
            //print chargroups that match the regex, not the whole word containing..
            System.out.print(matcher.group());
            //print start position in string (zero-based)
            System.out.print(" - Starts at: " + matcher.start());
            //prints end position, well to position (last letter position +1)
            System.out.print(" - ends: " + matcher.end() + "\n");
        }

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(targetString);

        while (matcher2.find()) {
            //print chargroups that match the regex, not the whole word containing..
            System.out.print(matcher2.group());
            //print start position in string (zero-based)
            System.out.print(" - Starts at: " + matcher2.start());
            //prints end position, well to position (last letter position +1)
            System.out.print(" - ends: " + matcher2.end() + "\n");
            counter++;


        }
        String replacedString = matcher.replaceAll("...");
        System.out.println(counter);
        System.out.println(replacedString);
    }
}
