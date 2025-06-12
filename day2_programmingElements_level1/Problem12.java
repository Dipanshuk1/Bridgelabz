package day2;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (in cm): ");
        double base = sc.nextDouble();
        System.out.print("Enter height (in cm): ");
        double ht = sc.nextDouble();

        double areaCm = 0.5 * base * ht;
        double areaInches = areaCm / 6.4516;

        System.out.println("The area of triangle is " + areaCm + " cm2 and " + areaInches + " inches2");
    }
}
