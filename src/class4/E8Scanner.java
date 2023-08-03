package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your name");
        String name = scanner.next();
        if(name.equals("Jamel")) {
            System.out.println("Senior SDET in two years");
        } else if (name.equals("Kat")) {
            System.out.println("I love being a stay at home wife");
        } else {
            System.out.println("Are you a family member? True or False");
            boolean family = scanner.nextBoolean();
            if(family == true) {
                System.out.println("Please enter your name");
                String famName = scanner.next();
                if(famName.equals("Momma")) {
                    System.out.println("Hi Momma");
                } else {
                    System.out.println("You aren't in the apartment");
                }
            } else {
                System.out.println("You are not in the family");
            }
        }
    }
}
