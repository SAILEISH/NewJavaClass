package assignment5;

public class Question_29 {

    private static int factorial(int num)
    {
        int product=1;
        for(int i = num; i>0; i--)
        {
            product = product*i;
        }
        return product;
    }

    private static double mathExpression(int number)
    {
        double a = 0;
        for(int i = 0; i<=number; i++)
        {
            a = a + ((double)i/ factorial(i));
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(mathExpression(3));
    }
}
