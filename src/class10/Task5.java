package class10;

import java.util.Arrays;

public class Task5 {
    /*
      Write a program to swap 2 numbers without a temporary variable?
    * */
    public static void main(String[] args) {

        int[] numbers = {78,80,77,88,90,91,75,60,80};

        for( int x : numbers) {
            numbers[3] = 66;
        }
        System.out.println(numbers[3]);
        System.out.println(Arrays.toString(numbers));

    }
}
