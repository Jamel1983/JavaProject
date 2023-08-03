package class4;

public class E3NestedIfElse {
    public static void main(String[] args) {
        double accountBalance = 30000;

        if(accountBalance > 28000) {
            System.out.println("We can afford a normal toyota");
            if(accountBalance > 50000) {
                System.out.println("We can afford a luxury car as well");
            }
        } else {
            System.out.println("We need to save more");
        }

        boolean diploma = true;
        double gpa = 3.3;

        if(diploma) {
            System.out.println("Congratulations");
            if(gpa > 3.5) {
                System.out.println("You are eligible for scholarhsip");
            } else {
                System.out.println("You should have studied harder");
            }
        }else {
            System.out.println("You should get a degree");
        }

        double rate = 4.0;
        int price = 150000;

        if(rate > 4.5) {
            System.out.println("Don't buy the house");
            if(price > 50000) {
                System.out.println("Will take a loan");
            } else {
                System.out.println("Pay cash");
            }
        }else {
            System.out.println("Consider buying");
        }
    }
}
