package assignment5;

public class Question_29 {

    private int factorial(int num)
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
        Question_29 obj = new Question_29(); // creating an object name 'obj'
        double a = 0;
        for(int i = 0; i<=number; i++)
        {
            a = a + ((double)i/ obj.factorial(i));
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(mathExpression(3));
    }
}
