package class4;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Credit Card
        System.out.println("Do you have a credit card?");
        String card = scanner.next();

        if(card.equals("No")) {
            System.out.println("We'd like to offer you one");
        } else {
            System.out.println("What's the balance on the card?");
            int balance = scanner.nextInt();
            if(balance > 1000) {
                System.out.println("Pay it off immediately");
            } else {
                System.out.println("You can spend more");
            }
        }
    }
}
