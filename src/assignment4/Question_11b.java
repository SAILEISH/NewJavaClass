package assignment4;
/*
 * Swap values of two different variables without using temporary variable
 * */
public class Question_11b {
    // define two numbers in variable as 'a' and 'b'

    public static void main(String[] args) {
        int a = 2;
        int b = 222;

        System.out.println("Value of a: "+a+"\nValue of b: "+b+"\n");

        System.out.println("After Swapping values!\n\n");

        a = a+b;
        b=Math.abs(b-a);
        a=Math.abs(a-b);

        System.out.println("Value of a: "+a+"\nValue of b: "+b+"\n");

    }

}
