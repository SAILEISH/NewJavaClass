package assignment5;

import java.util.Scanner;

public class Question_18 {

    public static String findLargest(int first, int second, int third)
    {
        String s;
        if(first>second && first>third)
        {
            s = "first";
            return s;
        }

        else if(second>first && second>third)
        {
            s = "second";
            return s;
        }

        else if(third>first && second<third)
        {
            s = "third";
            return s;
        }

        else
        {
            s = "";
            return s;
        }
    }

    public static void main(String[] args) {

        int first, second, third;
        String check;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        first = input.nextInt();

        System.out.println("Enter Second number: ");
        second = input.nextInt();

        System.out.println("Enter third number: ");
        third = input.nextInt();

        check = findLargest(first, second, third);

        if(new String("first").equals(check))
        {
            System.out.println("Largest number is "+first);
        }

        else if (new String("second").equals(check))
        {
            System.out.println("Largest number is "+second);
        }

        else if (new String("third").equals(check))
        {
            System.out.println("Largest number is "+third);
        }

        else
        {
            //do nothing
            System.out.println("All are equal!");
        }
    }

}
