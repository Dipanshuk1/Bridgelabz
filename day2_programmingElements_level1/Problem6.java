package day2;

public class Problem6 {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPer = 10;
        double dis = (discountPer / 100) * fee;
        double finalFee = fee - dis;
        System.out.println("The discount amount is INR " + dis + " and final discounted fee is INR " + finalFee);
    }
}
