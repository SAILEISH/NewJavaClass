package assignment6;

import java.util.Scanner;

// 2-D array addition
public class Question_37 {

    /*
    *  1  2  3      4  5  6     5  7  9
    *  4  5  6   +  2  7  8  =  6  12 14
    *  7  8  9      3  1  9     10 9  18
    *
    * */


    // two arrays arrA[] and arrB[] has to  be added to get the final array

    // user input for the two arrays of 3X3 dimension
    public void acceptArray(int arrA[][], int arrB[][], int rows, int columns, Scanner input){
        System.out.println("Enter for Array A:");
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                System.out.println("Enter A: ");
                arrA[i][j] = input.nextInt();
            }

        }

        System.out.println("Enter for Array B:");
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                System.out.println("Enter B: ");
                arrB[i][j] = input.nextInt();
            }
        }
    }

    // after accepting the user input, print the arrays in 3X3 dimensional form
    public void printArray(int arrA[][], int arrB[][], int rows, int columns)
    {
        System.out.println("Array A: ");
        for(int  i =0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                System.out.print(arrA[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Array B: ");
        for(int  i =0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                System.out.print(arrB[i][j]+" ");
            }
            System.out.println();
        }
    }

    // to carry out each element sum and print/store them in array form
    public void additionArray(int arrA[][], int arrB[][], int sum[][]){
        System.out.println("The sum is: ");
        for (int i=0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                sum[i][j]=arrA[i][j]+arrB[i][j];
            }
        }

        System.out.println("Sum of Array is: ");
        for(int  i =0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }

    // main method
    public static void main(String[] args) {

        // definition for arrays
        final int ROWS_A = 3;
        final int COLUMNS_A = 3;
        int [][] arrA= new int[ROWS_A][COLUMNS_A];

        int [][] arrB = new int[3][3];

        int [][] sum = new int[3][3];

        //Scanner for input access
        Scanner input = new Scanner(System.in);

        //creating object to call the function
        Question_37 obj = new Question_37();
        // first accept the two 3X3 array then print and then sum and print the array
        obj.acceptArray(arrA,arrB,ROWS_A,COLUMNS_A, input);
        obj.printArray(arrA, arrB, ROWS_A,COLUMNS_A);
        obj.additionArray(arrA, arrB, sum);
    }
}
