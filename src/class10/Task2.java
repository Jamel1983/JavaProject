package class10;

public class Task2 {
    /*
    * Create an array of integer values. After the array is created, calculate
      the sum of all stored elements in that array
    * */
    public static void main(String[] args) {

        int[] numbers = {78,80,77,88,90,91,75,60,80};

        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            System.out.println(i);
            sum = sum + numbers[i];
        }
        System.out.println("The sum of numbers array is " + sum);
    }
}
