import java.util.Collection;

/**
 * Created by udr013 on 23-3-2016.
 */
public class FormattingStrings {
    public static void main(String[] args) {

        /**
         *  more info https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
         *  the general syntax
         *  %[args_index$][flags][width][.precision]conversion_char
         *
         *  conversion chars are:
         *  %b = boolean prints: true if arg has a value or is true or false if arg is null or false
         *  %c = The result is a Unicode character
         *  %d = The result is formatted as a decimal integer
         *  %f =The result is formatted as a decimal number
         *  %s = The result is obtained by invoking arg.toString()
         *
         *  if confersions are uppercase like %S the result is displayed as String.toUpperCase()
         * */


        //formatting using %b
        String name = "Shreya";
        //int age = null;
        Integer age = null;
        boolean isShort = false;

        //throws exception at runtime when arg is missing: MissingFormatArgumentException: Format specifier '%b'
        System.out.printf("Name %b, age %b, isShort %b\n",name,age, isShort);
                        //prints Name true, age false, isShort false

        //notice the behavior when using the '$' indexSpecifier for args, when combined with args without specifier
        System.out.printf("Name %2$s, age %1$s, isShort %S\n",name,age, isShort);
                        // prints: Name null, age Shreya, isShort Shreya
        //Take a width of 10 and print the arg with a precision of 3 within the 10 width if
        // using flag '-' will outline to the left otherwise to the right
        System.out.format("Name defined %-10.3s.\n", name); //prints:Name defined Shr       .

        /**
         * Formatting using %c
         * only accepts char, byte short int and there WrapperClasses
         *
         * throws: java.util.IllegalFormatConversionException
         *
         * */

        System.out.printf("Char %C\n", '\u007b');
        System.out.printf("Char %c\n", new Character('\u6124'));
        System.out.printf("Char [%7C]\n", 'a');
        System.out.printf("Char %c\n", '\u0001');
        //System.out.printf("Char %c", new String("b"));

        /**
         * Formatting using %f and %d
         * %f used for float and double, prints 6digits behind the '.' by default unless sepecified differently (.2)
         *    also notice the number get converted up or down depending the next number is 5 or larger
         * %d used for literal values: byte short int long, Byte, Short, Integer, Long
         *
         * throws: java.util.IllegalFormatConversionException
         *
         * */

        System.out.printf("|%(f|\n", 12.1234535); //prints:    |12.123454|
        System.out.printf("|%10f|\n", 12.1234534); //prints:   | 12.123454|
        System.out.printf("|%+-10f|\n", 12.1234567);//prints:  |+12.123457 |
        System.out.printf("|%010f|\n", 12.1234567);//prints:   |012.123457| padded with zero(s)
        System.out.printf("|%10.2f|\n", 12.1254); //prints:  |     12.13|
        System.out.printf("|%,d|\n", -671212345); //prints:  |-671,212,345|
        System.out.printf("|%(,d|\n", -671212345); //prints: |(671,212,345)|
        //java.util.IllegalFormatPrecisionException: 6 //can't use it with integers
        //System.out.printf("|%(,18.6d|\n", 671212345);
    }
}
