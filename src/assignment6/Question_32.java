package assignment6;

import java.util.Scanner;

public class Question_32 {

    public static void acceptValue(Scanner input, int []arr)
    {
        System.out.println("Enter the number: ");
        for(int i=0; i<5;i++)
        {
            System.out.println("Value: ");
            arr[i] = input.nextInt();
        }

        Question_32 obj = new Question_32();
        obj.sumOfArray(arr);

    }

    private int sumOfArray(int []arr)
    {
        int sum = 0;
        for(int i=0; i<arr.length ;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("sum= "+sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[5];

        acceptValue(input, arr);
    }
}
