import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by udr013 on 22-3-2016.
 */
public class ScannerAndStringTokenizer {
    public static void main(String[] args) {

        //default the scanner will tokenize with whitespace, the \t and \n get ignored here
        Scanner scanner = new Scanner("The \tnew \nprogrammer exam");

        // also notice the use of the hasNext() and next() method
        while(scanner.hasNext())
        System.out.println(scanner.next());

        System.out.println("----------------");

        Scanner scanner2 = new Scanner("The5new88programmer exam6");
        //scanner2.useDelimiter("[\\d]+");
        scanner2.useDelimiter("[\\sa-zA-Z]+");
        // also notice the use of the hasNext() and next() method
        while(scanner2.hasNext())
            System.out.println(scanner2.next());

        System.out.println("----------------");

        /**
         * multiple methods of next...():
         * next(), nextInt(), nextBoolean()
         *
         */

        // whitespaces not allowed in this case: Exception in thread "main" java.util.InputMismatchException
        Scanner scanner1 = new Scanner("Shreya,20,true");
        scanner1.useDelimiter(",");
        System.out.println(scanner1.next());
        System.out.println(scanner1.nextInt());
        System.out.println(scanner1.nextBoolean());

        System.out.println("----------------");

        //
        Scanner sc4 = new Scanner("1 2 4 the new 55 Programmer 66 exam");
        sc4.useDelimiter("[\\sA-z]+");
        int total=0;
        while (sc4.hasNextInt())
            //if(sc4.hasNextInt()) gives endless loop
            total = total + sc4.nextInt();
        System.out.println(total);

        System.out.println("----------------");

        //Note because of localisation the double in a String needs a "," in my case: otherwise InputMismatchException
        //delimiters in the String get ignored
        Scanner sc5 = new Scanner("ABC \t223,2343 \nPaul 10");
        //sc5.findInLine("(ABC)+[\\d]+[\\d]+[A-Za-z]+[\\d]+");
        sc5.findInLine("[A-z]+[\\d]+[A-z]+[\\d]");
        System.out.println(sc5.next());
        System.out.println(sc5.nextDouble());
        System.out.println(sc5.next());
        System.out.println(sc5.nextInt());

        System.out.println("----------------");

        StringTokenizer tokenizer = new StringTokenizer("Start,your,Startup",",");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken(","));
        }


    }
}
