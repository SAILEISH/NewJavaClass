package assignment5;

public class Question_24 {

    private static int printFactorial(int n)
    {
        int temp = 1;
        for (int i=n; i>0; i--)
        {
            System.out.println(" "+i);
            temp = temp*i;
        }

        return temp;
    }

    public static void main(String[] args) {

        System.out.println("\nProduct is: "+printFactorial(5));
    }
}
