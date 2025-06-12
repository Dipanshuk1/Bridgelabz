package day2_programmingElements_level2;

import java.util.*;
public class FeetToYardsMiles{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double ft=input.nextDouble();
        double yards=ft/3;
        double miles=yards/1760;
        System.out.println("The distance in yards is "+yards+" while the distance in miles is "+miles);
    }
}