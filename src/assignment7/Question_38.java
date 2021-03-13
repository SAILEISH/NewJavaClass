package assignment7;

import java.util.Scanner;

public class Question_38 {


    public boolean palindromeCheck(String S)
    {
        // get two variable one at the beginning of the letter and one at the end
        int i = 0;
        int j = S.length() - 1;

        //compare characters
        while(i<j)
        {
            //if there is mismatch
            if(S.charAt(i) != S.charAt(j))
            {
                System.out.println("Not a palindrome!");
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Question_38 obj = new Question_38();

        System.out.println("Enter a letter: ");
        String s =  input.next();
        //obj.palindromeCheck(s);
        if(obj.palindromeCheck(s))
        {
            System.out.println("Is a Palindrome.");
        }
        else
        {
            System.out.println("Not a Palindrome.");
        }
    }
}
