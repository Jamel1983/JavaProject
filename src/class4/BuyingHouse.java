package class4;

public class BuyingHouse {
    public static void main(String[] args) {
        double rate = 4.0;
        int price = 160000;

        if(rate > 4.5) {
            System.out.println("Don't buy the house");
        } else {
            System.out.println("Will consider");
        }if (price > 50000) {
            System.out.println("Will use a loan");
        } else {
            System.out.println("Pay cash");
        }
    }
}
