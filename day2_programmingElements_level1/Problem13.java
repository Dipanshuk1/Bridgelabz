package day2;
import java.util.Scanner;
public class Problem13 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter perimeter: ");
            double perim = sc.nextDouble();
            double sd = perim / 4;
            System.out.println("The length of the side is " + sd + " whose perimeter is " + perim);
        }
}
