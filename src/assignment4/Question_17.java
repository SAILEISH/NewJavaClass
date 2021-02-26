package assignment4;

import java.util.Scanner;

/*
* if year is divisible by 100 then it is not a leap year
*                         400 then it is leap year
*                         4   then it is leap year
* for all other condition it is not a leap year
* */
public class Question_17 {

    public static boolean checkYear(int year){

        if(year%400 == 0)
        {
            return true;
        }

        else if(year%100 == 0){
            return false;
        }

        else if(year%4 == 0)
        {
            return true;
        }

        else
        {
            return  false;
        }

    }

    // Driver main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year;
        boolean check;

        System.out.println("Enter the year you want to find if it is a leap year or not: ");
        year = input.nextInt();

        check = checkYear(year);

        if(check == true)
        {
            System.out.println("Year "+year+" is a leap year.");
        }
        else
        {
            System.out.println("Year "+year+" is not a leap year.");
        }

        System.out.println (checkYear(year)?"Year "+year+" is a leap year.":"Year "+year+" is not a leap year.");


        /*
        * System.out.println(checkYear(year)?""Year "+year+" is a leap year.":"Year "+year+" is not a leap year.");
        * */

    }
}
