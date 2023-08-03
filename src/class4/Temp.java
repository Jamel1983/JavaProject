package class4;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your city");
        String city = scanner.nextLine();
        System.out.println("What's your temperature in Fahrenheit and we'll tell you in Celsius");
        double temp = scanner.nextInt();
        double celsius = (temp - 32) * 5 / 9;
        System.out.println("The temperature is " + celsius + " the city is " + city);
    }
}
