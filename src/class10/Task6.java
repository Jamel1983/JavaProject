package class10;

import java.util.Scanner;

public class Task6 {
    /*
      Write a java program to check whether a given number is prime or
      not?
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number to check if it's a prime number: ");
        int num = scanner.nextInt();

        if(num <= 1) {
            System.out.println(num + " Sorry, this is not a prime number");
        } else {
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(num + " Yes, this is a prime number");
            } else {
                System.out.println(num + " Sorry, this is not a prime number");
            }
        }

        scanner.close();
    }
}
