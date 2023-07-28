package class1;

public class E4DataTypes { //PascalCase

    public static void main(String[] args) {
        // data types convey what and what type will be stored in the variable
        // byte can only store from -128 up to 127
        byte age = 39;

        // short can store from -32768 to 32767
        short iphonePrice = 1099;

        // int can store -2147483648 to 2147483647
        int bankBalance = 80000;// cemalCase

        // long can store really big numbers
        long distance = 1111222222233333L;

        System.out.println(age);
        System.out.println(iphonePrice);
        System.out.println(bankBalance);
        System.out.println(distance);

        System.out.println("I am " + age + " and all my bank accounts total to " + bankBalance);

    }
}
