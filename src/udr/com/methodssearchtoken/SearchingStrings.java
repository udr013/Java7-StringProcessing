/**
 * Created by udr013 on 21-3-2016.
 */
public class SearchingStrings {
    public static void main(String[] args) {
        
        String a = "/bla/ja/hier/zal/je/het";

        String[] tokens = a.split("/",5);
        String b = a.split("/",5)[3];
            System.out.println(b);

        String test = "Paint the cup and then the plate.";
        StringBuilder test2 = new StringBuilder("Paint the cup and then the plate.");

        /**
         * Take note: lastIndex of searches backwards from given index position!
         * if not found it will return -1
         * */

        System.out.println(test.indexOf("they"));
        System.out.println(test.indexOf("the", 12));

        System.out.println(test.lastIndexOf('t',3));
        System.out.println(test.lastIndexOf("the", 12));

        System.out.println("----------------");

        /**
         * Note: stringbuilder can't seach on 'chars' !
         * */
        //System.out.println(test2.lastIndexOf('t',3));
        System.out.println(test2.lastIndexOf("t",3));

        System.out.println(test.contains("the")); //returns boolean value

        System.out.println("----------------");

        /**
         * substring and subSequence throw StringIndexOutOfBoundsException.
         * */

        System.out.println(test.substring(7));
        System.out.println(test.substring(2,12));//returns 2-11
        System.out.println(test2.substring(19));
        System.out.println(test2.substring(3,7));//returns 3-6

        System.out.println(test.subSequence(4,6));//returns 4-5
        System.out.println(test2.subSequence(4,6));

        System.out.println("----------------");

        /**
         *  method split(String regex)
         *  or split(String regex, int limit)
         *  Tokenizing is the process of splitting strings based on a separator into tokens
         *
         *  */

        String[]tokens = test.split("the");
        for (String c :tokens){
            System.out.println(c);
        }
    }
}
