package assignment3;

// two program

// one converts fahrenheit to Celsius and celsius to fahrenheit
// the other that converts kg to pound

import java.util.Scanner;

public class Question_8_9 {
    public static void main(String[] args) {

        double F, C; // fahrenheit and celsius
        double k, p; // kilogram and pound
        String choice;

        Scanner input = new Scanner(System.in);

        int x = 1;

        while(x!=0) {
            System.out.println("What you want to Convert? \n Temperature or Weight!");
            choice = input.next();

            if (new String("Temperature").equals(choice)) {
                System.out.println("Do you want F to C or C to F?");
                choice = input.next();

                if (new String("FtoC").equals(choice)) {
                    System.out.println("Enter Value in degree Fahrenheit: ");
                    F = input.nextDouble();

                    C = (double) (5.0 / 9.0) * (F - 32);
                    System.out.println("Value in C " + C + " C");

                } else {
                    System.out.println("Enter Value in degree Celsius: ");
                    C = input.nextDouble();

                    F = (9.0 / 5.0) * C + 32;
                    System.out.println("Value in F " + F + " F");
                }
            }// end of if -- temperature

            else if(new String("Weight").equals(choice)){
                System.out.println("What you want the result weight in?");
                System.out.println("Kg or lb");
                choice = input.next();

                if(new String("kg").equals(choice))
                {
                    System.out.println("What is the value in pound (lb) ?");
                    p = input.nextDouble();

                    k = p*0.453592;
                    System.out.println(""+p+" lb in kilo is "+k+" kg.");
                }
                else {
                    System.out.println("What is the value in kilo (kg) ?");
                    k = input.nextDouble();

                    p = k*2.20462;
                    System.out.println(""+k+" lb in kilo is "+p+" kg.");
                }
            }

            else if(new String("Stop").equals(choice)){
                x = 0;
                System.out.println("System Halted!");
            }
        } // end of while loop
    }
}
