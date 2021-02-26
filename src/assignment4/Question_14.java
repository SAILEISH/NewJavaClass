package assignment4;

import java.util.Scanner;

public class Question_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.println("Enter the value for x: ");
        x = input.nextInt();
        System.out.println("Enter the value for y: ");
        y = input.nextInt();

        if(x==y){
            System.out.println("Both x and y are equal.");
        }

        else if(x>y){
            System.out.println("X is greater than y.");
        }
        else if(x<y)
        {
            System.out.println("Y is greater than x.");
        }
        else{

        }
    }
}
