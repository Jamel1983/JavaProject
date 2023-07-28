package class2;

public class E6ShorthandOperators {

    public static void main(String[] args) {

        int number = 20;

        number = number + 10; // take the previous value of a number and add 10 to it
        // shorthand operators
        number+= 20;
        System.out.println(number); // answer is 30 + 20 = 50

        number-= 10;
        System.out.println(number); // answer is 50 - 10 = 40

        number*= 2;
        System.out.println(number); // answer is 40 * 2 = 80

        number/= 2;
        System.out.println(number); // answer is 2 / 80 = 40

        number%=30;
        System.out.println(number); // answer is 10

        boolean myBoolean = false;
        double money = 99999.99;
        System.out.println("" + money + myBoolean);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        float dt = 8.2F;
        float itself = dt * dt;
        System.out.println(dt + itself);

    }


}
