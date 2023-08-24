package class10;

public class Task3 {
    /*
      Create a 2D array or integer type where you will store odd and even
      numbers. Develop a program which will identify/print the even
      numbers only.
    * */
    public static void main(String[] args) {

        int[][] numbers = {
                {78,80,77,88,90,91,75,60,80},
                {46,45,74,88,99,23,24,10,60}
        };

        int count = 0;

        for(int row = 0; row < numbers.length; row++){
            for(int col = 0; col < numbers[row].length; col ++){
                if(numbers[row][col] % 2==0){
                    System.out.print(numbers[row][col] + " ");
                }
            }
        }

    }
}
