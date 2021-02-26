package assignment5;

public class Question_26 {

    private static void reverseNumber(int number)
    {
        int out;
        int temp=0;
        while(number%10!=0)
        {
            out = number % 10;
            temp = temp*10+out;
            number = number/10;
        }

        System.out.println(temp);
        //return temp;
    }
    public static void main(String[] args) {
        reverseNumber(12345);
    }
}
