package assignment3;

import java.text.DecimalFormat;
import java.util.Scanner;
/*
* writing a program for a Mathematical function
* */
public class Question_10a {


    private static DecimalFormat df2 = new DecimalFormat("#.###");

    public static void main(String[] args) {
        double s, u, t, a;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter time taken for the path (t): ");
        t = input.nextDouble();
        System.out.println("Enter acceleration of the body (a): ");
        a =input.nextDouble();
        System.out.println("Enter initial velocity of the body(u): ");
        u = input.nextDouble();

        s = u*t + (1/2)*a*Math.pow(t,2);
        System.out.println("Distance covered is: "+ df2.format(s)+" meters.");
    }
}
