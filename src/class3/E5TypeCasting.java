package class3;

public class E5TypeCasting {
    public static void main(String[] args) {

        // when trying to store a large int into a byte it will throw a random number
        int number = 450;
        byte number2;
        number2 = (byte)number;
        System.out.println(number2);

        // short to int
        short box1 = 2000;
        int box2 = box1;
        System.out.println(box2);
    }
}
