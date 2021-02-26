package assignment5;

import java.util.Scanner;

public class Question_25 {

    private static void findLargest(int totalStudents)
    {
        Scanner input1 = new Scanner(System.in);
        String name = ""; String tempName = "";
        int score = 0; int tempScore;

        for(int i=0; i<totalStudents; i++)
        {
            System.out.println("Enter Students name: ");
            tempName = input1.next();

            System.out.println("Enter score: ");
            tempScore = input1.nextInt();

            if(tempScore>score)
            {
                name = tempName;
                score = tempScore;
            }

            else
            {

            }
        }

        System.out.println(name+" got the highest score of "+score+ " points.");
    }

    public static void main(String[] args)
    {
        int totalStudents;
        Scanner input2 = new Scanner(System.in);

        System.out.println("Total number of students: ");
        totalStudents = input2.nextInt();

        findLargest(totalStudents);

    }
}
