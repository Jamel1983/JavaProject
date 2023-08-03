package class3;

public class E8IfElseStatements {
    public static void main(String[] args) {
        // If else statements

        System.out.println("---------------------------------------");
        System.out.println("Can you buy this TV");
        // Will check account and price
        double accountBalance = 800;
        double price = 1000;

        if (accountBalance >= price) {
            System.out.println("You can buy this item!");
        } else {
            System.out.println("You need to save more!");
        }

        System.out.println("---------------------------------------");

        int age = 21;

        if (age > 15) {
            System.out.println("You can drive");
        } if (age > 20) {
            System.out.println("But, please don't drink and drive!");
        } else {
            System.out.println("You can't drive");
        }

        System.out.println("---------------------------------------");

        int batch = 17;
        if(batch == 17) {
            System.out.println("Greatest Batch!");
        }



    }
}
