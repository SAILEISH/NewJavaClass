package assignment5;

public class Question_30 {


    private static int fibonacciSeries(int num)
    {
        int sum= 0;
        int t1 = 0; int t2 = 1;
        for(int i=0; i<=num; i++)
        {
            System.out.println(" "+sum);
            sum = t1 + t2;
            t1=t2;
            t2=sum;
        }
        return 0;
    }

    public static void main(String[] args) {
        fibonacciSeries(10);
    }
}
