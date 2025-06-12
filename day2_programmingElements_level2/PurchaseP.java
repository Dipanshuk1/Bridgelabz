package day2_programmingElements_level2;

import java.util.*;
public class PurchaseP{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Unit Price: ");
        double unitP=input.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity=input.nextInt();
        double total=unitP*quantity;
        System.out.println("The total purchase price is INR "+total+" if the quantity "+quantity+" and unit price is INR "+unitP);
    }
}