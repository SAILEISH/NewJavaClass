package assignment5;

import java.util.Scanner;

public class Question_28 {


    private static void isPrimeNumber(int num) // check if it is a prime or not
    {
        boolean flag= false;
        for(int i=2; i<=num/2; ++i)
        {
            // num/2 because -> ex: 30.. least number that can divide 30 is 15 so count up to 15 only
            //for non-prime
            if(num%i == 0) // this is not a prime
            {
                flag = true;
                break;
            }
            else
            {
                flag = false;
            }
        }

        if(flag==true)
            System.out.println("Not a Prime Number.");
        else
            System.out.println("Prime Number");
    }

    private static void firstNthPrime(int num) // with the given value of n, find all prime numbers from 1 to N
    {

    }

    private static void allPrimeBetween(int start, int end) // from any given range find all the prime numbers
    {

    }
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter a number ");
        num = input.nextInt();

        isPrimeNumber(num);
    }
}
