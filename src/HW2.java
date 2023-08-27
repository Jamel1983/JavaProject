package Class11;

public class HW2 {
    public static void main(String[] args) {
        String str = "That's a crazy thought";

        String[] strArr = str.split(" ");

        for(String x : strArr) {
            System.out.print(x);
        }
    }
}
