package class10;

public class Task9 {
    /*
      Write a java program to find the second largest number in the array
    * */
    public static void main(String[] args) {

        int[] numbers = {7, 5, 21, 19, 15, 3};
        int largest = 0;
        int secondLargest = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                secondLargest = largest;
                largest = numbers[i];
            }else if(numbers[i] > secondLargest && numbers[i] != largest){
                secondLargest = numbers[i];
            }
        }
        System.out.println(secondLargest);
    }
}
