package assignment6;

public class Question_35 {

    public static void main(String[] args) {

        int []arr = new int[]{100,200, 3, 50, 201};
        int []temp = new int[1];

        int n = 1; // no. of elements in array
        int count = 5;

        while(n<5)
        {
            for (int i = 0; i<count; i++)
            {
                //swap largest to smallest
                if(arr[i]<arr[n])// arr[1]>arr[0]
                {
                    temp[0] = arr[n];
                    arr[n] = arr[i];
                    arr[i] = temp[0];
                }
            }
            n++;
        }

        //print the array from largest to smallest
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Second largest number is: "+arr[1]);

    }
}
