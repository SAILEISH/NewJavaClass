package assignment2;

import java.util.Scanner;

public class Q_Five {

    public static void main(String[] args) {
        // to find area of circle pi*r^2
        // to find area of rectangle l*w
        // to find area of triangle 1/2*b*h

        double r, l, w, b, h;
        double A_circle, A_rectangle, A_triangle;

        Scanner input = new Scanner(System.in);
        int x=1;
        int count =0;

        while (x==1) {
            System.out.println("What is the shape that you want to find the area of ?");
            String choice = input.nextLine();
            //System.out.println(" Entered ans is " + choice);
            System.out.println(""+count++);

            if (new String("triangle").equals(choice) || new String("Triangle").equals(choice)) {
                System.out.println("Enter the base of triangle: ");
                b = input.nextDouble();

                System.out.println("Enter the height of  a triangle: ");
                h = input.nextDouble();
                double area_triangle = 0.5 * b * h;
                System.out.format("Area of Triangle: %.2f\n", area_triangle);
            }

            else if (new String("rectangle").equals(choice) || new String("Rectangle").equals(choice)) {
                System.out.println("Enter the length of rectangle: ");
                l = input.nextDouble();

                System.out.println("Enter the width of rectangle: ");
                w = input.nextDouble();

                System.out.println("Area of Rectangle: " + 0.5 * l * w);
            }

            else if (new String("circle").equals(choice) || new String("Circle").equals(choice)) {
                System.out.println("Enter the radius of circle: ");
                r = input.nextDouble();

                System.out.println("Area of Triangle: " + 3.14 * r * r);
            }

            else if(new String("Stop").equals(choice) || new String("stop").equals(choice)){
                x = 0;
                System.out.println("System Ended");
            }
            //choice = "";
        }
    }
}
