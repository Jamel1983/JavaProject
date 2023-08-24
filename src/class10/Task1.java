package class10;

public class Task1 {
    /*
    * Create a program that uses an array to store a list of temperatures for
      a week, and then uses a loop to find the highest and lowest
      temperature for the week.
    * */
    public static void main(String[] args) {

        int[] temp = {78,80,77,88,90,91,75,60,80};

        //int index = temp.length - 1;
        int largest = temp[0];
        int smallest = temp[0];

        for(int i = 0; i < temp.length; i++){
            System.out.println(i);
            if(temp[i] > largest){
                largest = temp[i];

            }
            if(temp[i] < smallest){
                smallest = temp[i];
            }
        }
        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
    }
}
