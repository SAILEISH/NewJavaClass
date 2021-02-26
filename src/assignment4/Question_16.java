package assignment4;

import java.util.Scanner;

public class Question_16 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int a;

        System.out.println("Enter a number to detect if it is even or odd: ");
        a = input.nextInt();

        if(a%2 == 0)
        {
            System.out.println("Given number "+a+" is even number.");
        }

        else {
            System.out.println("Given number "+a+" is odd number.");
        }
    }
}
