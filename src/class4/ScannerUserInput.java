package class4;

import java.util.Scanner;

public class ScannerUserInput {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        // create the object of the scanner class sp we can reuse the
        // logic from the class, which is already written by Java developers
        Scanner scanner = new Scanner(System.in);

        // taking an input from the user and storing in int a name variable
        String name = scanner.nextLine();
        if(name.equals("Jamel")) {
            System.out.println("Senior SDET");
        } else {
            System.out.println("I don't know you");
        }
        //System.out.println("Hello " + name);
    }
}
