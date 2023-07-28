package class2;

public class Variable {

    public static void main(String[] args) {

        String firstName = "Jamel";
        String lastName = "Dumas";
        char grade = 'A';
        String city = "Chambersburg";
        String state = "PA";
        long phoneNumber = 5556963231L;

        System.out.println("My first name is " + firstName + " and my last name is " + lastName);
        System.out.println("My grade is " + grade + "!");
        System.out.println("I live in city " + city + " and state " + state);
        System.out.println("And my phone number is " + phoneNumber);

        firstName = "Kat";
        lastName = "Cerniglia";
        grade = 'B';
        city = "Chambersburg";
        state = "PA";
        phoneNumber = 6595232589L;

        System.out.println();
        System.out.println("My first name is " + firstName + " and my last name is " + lastName);
        System.out.println("My grade is " + grade + "!");
        System.out.println("I live in city " + city + " and state " + state);
        System.out.println("And my phone number is " + phoneNumber);

        city = "Tampa";
        state = "Florida";

        System.out.println();
        System.out.println("Jamel used to live in " + city + " " + state);

    }
}
