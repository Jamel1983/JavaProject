package Class11;

public class HW8 {
    public static void main(String[] args) {
        /*
        * How would you swap  2 strings without a temporary variable?
        * */
        String a = "Syntax";
        String b = "Java";

        b = a + (a = b).substring(0,0);

        System.out.println(b);
        System.out.println(a);
    }
}
