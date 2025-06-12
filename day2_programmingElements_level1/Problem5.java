package day2;

public class Problem5 {
    public static void main(String[] args) {
        int p = 14;
        int st = 3;

        int pensEach = p / st;
        int leftover = p % st;

        System.out.println("The Pen Per Student is " + pensEach + " and the remaining pen not distributed is " + leftover);
    }
}
