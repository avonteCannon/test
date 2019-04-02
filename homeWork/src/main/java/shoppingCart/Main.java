package shoppingCart;

public class Main {

    public static double calculateDiscount( double price, double discount){
        double x = 100;

        double y = discount / x;

        double z = y * price;

        double finalPrice = price - z;

        return finalPrice;
    }

    public static double calculateRadiusOfCircle(double radius){

        double x = 3.14159 * Math.pow(radius,2);

        double finalArea = x;

        return finalArea;
    }


    public static void main(String[] args) {

        System.out.println(calculateDiscount(30, 20));
        System.out.println(calculateRadiusOfCircle(40));


    }
}
