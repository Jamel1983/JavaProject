package Class11;

public class HW5 {
    public static void main(String[] args) {
        String a = "This is sentence i want to reverse";

        String[] strings = a.split(" ");

        System.out.print(strings.length);

        String revSen = "";

        for(String string : strings){
            String revWord = "";
            for (int i = string.length() - 1; i >= 0 ; i--) {
                revWord += string.charAt(i);
            }
            revSen += revWord + " ";
        }
        revSen = revSen.trim();

        System.out.println(revSen);
    }
}
