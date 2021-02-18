package assignment2;

import java.util.Scanner;

public class Q_Four {
    public static void main(String[] args) {
        double P, T, R;

        Scanner input = new Scanner(System.in);
        System.out.println("What is your principal amount? ");
        P= input.nextDouble();
        System.out.println("Enter the Time in years: ");
        T= input.nextDouble();
        System.out.println("Enter the rate for principal amount: ");
        R= input.nextDouble();

        System.out.println("Simple interest amount is " + (P*T*R)/100);
    }
}
