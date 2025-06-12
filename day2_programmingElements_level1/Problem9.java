package day2;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter discount percent: ");
        double discountPercent = sc.nextDouble();
        double dis = (discountPercent / 100) * fee;
        double finalFee = fee - dis;
        System.out.println("The discount amount is INR " + dis + " and final discounted fee is INR " + finalFee);
    }
}
