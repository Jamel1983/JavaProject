package class3;

public class E9ElseIfStatements {
    public static void main(String[] args) {
        int day = 5;

        if(day == 1){
            System.out.println("It's Monday");
        } else if(day == 2) {
            System.out.println("It's Tuesday, time for class");
        } else if (day == 3) {
            System.out.println("It's Wednesday, time for class");
        } else if (day == 4) {
            System.out.println("It's Thursday, time for review");
        } else if (day == 5) {
            System.out.println("It's Friday, it's date night");
        } else if (day == 6) {
            System.out.println("It's Saturday, time to code some more");
        } else {
            System.out.println("Same as Saturday");
        }

        System.out.println("___________________________________________________________");
        //
        String fruit ="peach";

        if(fruit.equals("Orange") ) {
            System.out.println("Price is $5");
        } else if (fruit.equals("Mango")) {
            System.out.println("Price is $8");
        } else if (fruit.equals("Apple")){
            System.out.println("Price is $4");
        } else {
            System.out.println("This fruit isn't available");
        }

    }
}
