package assignment5;

import java.util.Scanner;

public class Question_23 {

    private static int sumToNth(int n)
    {
        int sum = 0;

        for (int i=0; i<=n; i++)
        {
            sum = sum + i;
        }

        return  sum;
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the nth number: ");
        n = input.nextInt();

        System.out.println("The sum is: "+sumToNth(n));
    }
}
