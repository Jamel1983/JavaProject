package class2;

public class Arithmetics {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int addNum = num1 + num2;
        int mulNum = num1 * num2;
        int subNum = num2 - num1;
        int divNum = num2 / num1;
        int modNum =num2 % num1;
        System.out.println("The addition of 2 numbers" + num1 + "and" + num2 + "is equal to " + addNum);
        System.out.println("The multiplication of 2 numbers" + num1 + "and" + num2 + "is equal to " + mulNum);
        System.out.println("The subtraction of 2 numbers" + num1 + "and" + num2 + "is equal to " + subNum);
        System.out.println("The division of 2 numbers" + num1 + "and" + num2 + "is equal to " + divNum );
        System.out.println("The division of 2 numbers" + num1 + "and" + num2 + "is equal to " + divNum + "." +modNum );

        byte b = 8;

        // to get 20, we can't use b = b * 2.5 because a byte can't go into a float with direct math
        // so we have to use
        b *= 2.5;
        System.out.println(b);
        System.out.println("Making a change");



    }
}
