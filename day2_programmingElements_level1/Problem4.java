package day2;

public class Problem4 {
    public static void main(String[] args) {
        double cPrice = 129;
        double sPrice = 191;
        double profit = sPrice - cPrice;
        double profitPercent = (profit / cPrice) * 100;

        System.out.println("The Cost Price is INR " + cPrice + " and Selling Price is INR " + sPrice +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}
