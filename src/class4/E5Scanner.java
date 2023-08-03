package class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        double age = scanner.nextDouble();

        System.out.println("You're age is " + age);
    }
}
