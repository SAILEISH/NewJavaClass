package assignment5;

import java.util.Scanner;

public class Question_20 {

    private static int additionMath(int a, int b)
    {
        return a+b;
    }

    private static int subtractionMath(int a, int b)
    {
        return a-b;
    }

    private static int multiplicationMath(int a, int b)
    {
        return a*b;
    }

    private static double divisionMath(int a, int b)
    {
        return (double)a/(double)b;
    }

    public static void main(String[] args) {
        char operator;
        int a, b;
        double answer = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = input.nextInt();

        System.out.println("Enter second number: ");
        b = input.nextInt();

        System.out.println("Enter the operation you want to carry out: ");
        operator = input.next().charAt(0);

        if(operator == '+'){
            answer = additionMath(a,b);
        }

        else if (operator == '-')
        {
            answer = subtractionMath(a,b);
        }

        else if(operator == '*')
        {
            answer = multiplicationMath(a,b);
        }

        else if (operator == '/')
        {
            answer = divisionMath(a,b);
        }

        System.out.println(""+a+" "+operator+" "+b+" = "+answer);
    }
}
