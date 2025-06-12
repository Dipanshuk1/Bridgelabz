package day2;
import java.util.*;
public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        double yds = feet / 3;
        double miles = yds / 1760;

        System.out.println("The distance is " + yds + " yards and " + miles + " miles.");
    }
}
