package class4;

public class E2NestedIf {
    public static void main(String[] args) {

        boolean winter = true;
        String jacketColor = "black";

        // Nested if statement
        if(winter) {
            System.out.println("It's very cold!");
            if(jacketColor.equals("red")) {
                System.out.println("Let's go with red shoes");
            } else {
                System.out.println("Let's go with the blue ones");
            }
        } else {
            System.out.println("No need to wear a jacket");
        }
    }
}
