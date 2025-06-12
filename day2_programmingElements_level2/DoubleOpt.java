package day2_programmingElements_level2;
import java.util.*;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double ht = sc.nextDouble();

        double areaInCm = 0.5 * base * ht;
        double areaInInch = areaInCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaInInch + " and sq cm is " + areaInCm);
    }
}
