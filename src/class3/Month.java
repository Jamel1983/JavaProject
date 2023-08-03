package class3;

public class Month {
    public static void main(String[] args) {
        int month = 10;

        if(month == 1) {
            System.out.println("January");
        }if(month == 2) {
            System.out.println("February");
        }if(month == 3) {
            System.out.println("March");
        }if(month == 4) {
            System.out.println("April");
        }if(month == 5) {
            System.out.println("May");
        }if(month == 6) {
            System.out.println("June");
        }if(month == 7) {
            System.out.println("July");
        }if(month == 8) {
            System.out.println("August");
        }if(month == 9) {
            System.out.println("September");
        }if(month == 10) {
            System.out.println("October");
        }if(month == 11) {
            System.out.println("November");
        }if(month == 12) {
            System.out.println("December");
        }

        // check whether a number is negative or positive
        int num1 = -10;

        if(num1 > 0) {
            System.out.println("It's positive");
        } else if (num1 < 0) {
            System.out.println("It's negative");
        } else {
            System.out.println("It's zero");
        }

        // check whether a number is even or odd
        int num2 = 4;

        if(num2 % 2 == 0) {
            System.out.println("It's even");
        } else if (num2 % 2 == 1) {
            System.out.println("It's odd");
        } else {
            System.out.println("hurray");
        }

    }
}
