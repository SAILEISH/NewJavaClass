package assignment4;

import java.util.Scanner;

public class Question_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x; int y=0;
        while(y==0)
        {
            System.out.println("Enter the number: ");
            x = input.nextInt();

            if(x<0)
            {
                System.out.println("Displayed number is: "+x+"\n");
            }
        }
    }
}
