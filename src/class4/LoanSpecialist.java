package class4;

import java.util.Scanner;

public class LoanSpecialist {
    public static void main(String[] args) {

        //Loan Specialist
        Scanner scanner = new Scanner(System.in);

        // Tell client to enter amount
        System.out.println("Please enter the amount of loan requesting");
        int loanAmount = scanner.nextInt();

        if(loanAmount <= 200000) {
            System.out.println("You're approved");
        } else {
            System.out.println("Loan amount too high for your profile, we're sorry");
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("DMV");

        // DMV
        System.out.println("How old are you?");
        int customerAge = scanner.nextInt();

        if(customerAge >= 18) {
            System.out.println("We can issue you a driver license");
        } else {
            System.out.println("We can only offer you a learners permit");
        }


        
    }
}
