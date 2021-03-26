package assignment7;

public class Question_40 {

    public static void main(String[] args) {

        String input  = "abcdef";

        // here we convert into bytes from string

        byte[] x = input.getBytes();

        byte[] result = new byte[x.length];

        // storing in reverse order

        for(int i = 0; i<x.length; i++)
        {
            result[i] = x[x.length-i-1];
        }

        System.out.println(new String(result));
    }
}
