package day2;
import java.util.*;
public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double uPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double tPrice = uPrice * quantity;
        System.out.println("The total purchase price is INR " + tPrice + " if the quantity " + quantity + " and unit price is INR " + uPrice);
    }
}
