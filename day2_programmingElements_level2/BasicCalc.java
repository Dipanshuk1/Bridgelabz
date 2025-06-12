package day2_programmingElements_level2;
import java.util.*;
public class BasicCalc{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number1: ");
        double numb1=input.nextDouble();
        System.out.print("Enter number2: ");
        double numb2=input.nextDouble();
        double add=numb1+numb2;
        double sub=numb1-numb2;
        double mul=numb1*numb2;
        double div=numb1/numb2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+numb1+" and "+numb2+" is "+add+", "+sub+", "+mul+", and "+div);
    }
}
