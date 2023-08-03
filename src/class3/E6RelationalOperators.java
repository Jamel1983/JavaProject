package class3;

public class E6RelationalOperators {
    public static void main(String[] args) {

        // Relational Operators will always return true or false
        System.out.println(15 > 10);
        System.out.println(15 > 20);

        boolean result = 100 > 205; // performed a relational operational and stored them into result variable
        System.out.println(result);
        /*
        String a = "Aladin";
        String b = "deeplai";
        System.out.println( a > b);
        System.out.println(true > false);

         */

        // Will print false ( notice single quotes)
        System.out.println('A' > 'B'); // A = 65 > B = 66 in ASCII Table

        // Will print true
        System.out.println('B' > 'A'); // B = 66 > A = 65 in ASCII Table
    }
}
