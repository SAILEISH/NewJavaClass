package assignment5;

import java.util.Scanner;

public class Question_31 {


    public static void main(String[] args) {
        //int n = 8;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern you want to see: ");
        int n = input.nextInt();
        System.out.println("\n\n");
        int i = 1;
        int sum = 0;
        while(i<=n)
        {
            sum = sum*10+i;
            System.out.println(sum);
            //n = n/10;
            i++;
        }
    }
}
