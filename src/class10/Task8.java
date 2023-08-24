package class10;

public class Task8 {
    /*
      Maximum and minimum number in the array?
    * */
    public static void main(String[] args) {

        int[] numbers = {7, 5, 8, 19, 15, 3};
        int max = 0;
        int min = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];

            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
