package assignment6;

public class Question_34 {

    public static void main(String[] args) {

        int []arr = new int[]{1,2,3,4,5};
        int []temp = new int[1];
        int n = 4;
        int count = 5;

        // print the initial value
        System.out.println("Before the reverse: ");
        for(int i = 0; i<count; i++)
        {
            System.out.println(arr[i]);
        }

        for (int i = 0; i<count/2; i++)
        {
            //swap
            temp[0] = arr[i];
            arr[i] = arr[n];
            arr[n] = temp[0];
            i++; n--;
        }

        // print after the reverse
        System.out.println("After reversing the given array: ");
        for(int i = 0; i<count; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
