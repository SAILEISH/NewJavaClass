package assignment3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question_10b {
    private static DecimalFormat df2 = new DecimalFormat("#.###");
    public static void main(String[] args) {
        double area, s, a, b, c;
        double temp;

        Scanner input = new Scanner(System.in);
        System.out.println("s: ");
        s = input.nextDouble();
        System.out.println("a: ");
        a = input.nextDouble();
        System.out.println("b: ");
        b = input.nextDouble();
        System.out.println("c: ");
        c = input.nextDouble();
        temp = s*(s-a)*(s-b)*(s-c);
        if(temp<0)
        {
            System.out.println("Value under the Square root cannot be less than 0 (or negative).");
        }
        else
        {
            area = Math.sqrt(temp);
            System.out.println("The area is: " +df2.format(area));
        }
    }
}
