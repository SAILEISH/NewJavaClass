package assignment5;

import java.util.Scanner;

public class Question_19 {

    private static String checkTriangle(int side1, int side2, int side3){
        String s;
        if(side1 == side2 && side2==side3)
        {
            s = "Equilateral";
            return s;
        }

        else if(side1==side2 || side2==side3 || side1==side3)
        {
            s= "Isosceles";
            return s;
        }

        else
        {
            s = "Scalene";
            return s;
        }
    }

    public static void main(String[] args) {
        int side1, side2, side3;
        String check;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of side1: ");
        side1 = input.nextInt();

        System.out.println("Enter length of side2: ");
        side2 = input.nextInt();

        System.out.println("Enter length of side3: ");
        side3 = input.nextInt();

        check = checkTriangle( side1, side2, side3);

        if(new String("Equilateral").equals(check))
        {
            System.out.println("Equilateral triangle.");
        }

        else if(new String("Isosceles").equals(check))
        {
            System.out.println("Isosceles triangle.");
        }

        else if(new String("Scalene").equals(check))
        {
            System.out.println("Scalene triangle.");
        }
    }
}
