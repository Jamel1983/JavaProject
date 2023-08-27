package Class11;

public class HW4 {
    public static void main(String[] args) {
        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";

        String[] str = a.split("[?]");

        System.out.println(str.length);
    }
}
