package class10;

public class Task7 {
    /*
      Write a Java Program to print the first 10 numbers of Fibonacci series.
    * */
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;

        for(int i = 2; i < 12; i++){
            int total = num1 + num2;
            System.out.print(" " + total);
            num1 = num2;
            num2 = total;
        }
        System.out.println();
    }
}
