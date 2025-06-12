package day2_programmingElements_level2;

import java.util.*;
public class TriangleArea{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter base: ");
        double b=input.nextDouble();
        System.out.print("Enter height: ");
        double height=input.nextDouble();
        double areaInches=0.5*b*height;
        double areaCm=areaInches*6.4516;
        System.out.println("The Area of the triangle in sq in is "+areaInches+" and sq cm is "+areaCm);
    }
}
