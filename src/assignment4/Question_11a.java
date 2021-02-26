package assignment4;
/*
* Swap values of two different variables using temporary variable
* */
public class Question_11a {

    public static void main(String[] args) {
        // define two numbers in variable as 'a' and 'b'

        int a = 2;
        int b = 222;

        System.out.println("Value of a: "+a+"\nValue of b: "+b+"\n");

        System.out.println("After Swapping values!\n\n");
        int temp;

        temp = a;
        a= b;
        b= temp;

        System.out.println("Value of a: "+a+"\nValue of b: "+b+"\n");
    }
}
