package day2;

public class Problem7 {
    public static void main(String[] args) {
        double radius = 6378;
        double pi = 3.14159;
        double volume = (4.0 / 3.0) * pi * Math.pow(radius, 3);
        double volumeMiles3 = volume / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volume + " and cubic miles is " + volumeMiles3);
    }
}
