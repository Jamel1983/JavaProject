package class4;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Salary

        System.out.println("Enter numbers of worked years");
        int years = scanner.nextInt();

        System.out.println("What is your annual salary");
        int salary = scanner.nextInt();

        if(years >= 5){
            System.out.println("You're eligible for the bonus");
            if(salary > 50000) {
                System.out.println("Your bonus is 5000");
            } else {
                System.out.println("Your bonus is 3000");
            }
        } else {
            System.out.println("Sorry, you are not eligible for the bonus");
        }
    }
}
