package assignment3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question_10c {

    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x, b, a, c;
        double temp;

        System.out.println("b: ");
        b = input.nextDouble();
        System.out.println("a: ");
        a = input.nextDouble();
        System.out.println("c: ");
        c = input.nextDouble();

        temp = Math.pow(b, 2)-4*a*c;

        if(temp<0)
        {
            System.out.println("Value inside square root is negative (i.e. less than 0).");
        }
        else{
            x = (-b+Math.sqrt(temp))/(2*a);
            System.out.println("The value of x is\nx: "+ df2.format(x));
        }
    }
}
