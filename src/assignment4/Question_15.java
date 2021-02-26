package assignment4;

import java.util.Scanner;

public class Question_15 {

    public static void main(String[] args) {

        Scanner input  =  new Scanner(System.in);

        int ascii_input;

        System.out.println("Enter ASCII value (0-128): ");
        ascii_input = input.nextInt();
        char output = (char) ascii_input; //

        System.out.println("Corresponding value for "+ ascii_input +" ASCII code is "+ output);
    }
}
