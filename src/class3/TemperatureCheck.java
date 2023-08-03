package class3;

public class TemperatureCheck {
    public static void main(String[] args) {

        double temp = 100;
        double cold = 32;

        if(cold < temp) {
            System.out.println("Water will freeze with temperature " + cold);
        } if( temp > cold) {
            System.out.println("Water will NOT freeze with temperature " + temp);
        } else {
            System.out.println("Don't go outside");
        }

        if (cold < temp) {
            System.out.println("Water will freeze with temperature " + cold);
        } else {
            System.out.println("Water will NOT freeze with temperature " + temp);
        }
    }
}
