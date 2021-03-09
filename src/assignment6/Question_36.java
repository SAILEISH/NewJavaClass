package assignment6;

public class Question_36 {
    /*
    *
    * Works if there are two same numbers
    * Doesn't work if the same number is there for more than 2 times
    *
    * */
    public static void main(String[] args)
    {
        int []arr = new int[]{2,3,5,2,4,1,1};
        int []temp = new int[7];
        int a = 0; // for temp[] indices
        int n = 0;
        int count = 7;

        while(n<arr.length)
        {
            for(int i = n+1; i<arr.length; i++)
            {
                    if(arr[i]==arr[n])
                    {
                        temp[a] = arr[n];
                        a++;
                    }
            }
            n++;
        }

        // This shows how many numbers are there in temp[] -- 0 is not counted
        int x = 0;
        System.out.println("Duplicate numbers are: ");
        for(int i = 0; i<temp.length; i++)
        {
            if(temp[i]!=0)
            {
                x++;
            }
        }

        // noe print for the result
        for(int i = 0; i<x; i++)
        {
            System.out.println(temp[i]);
        }
        System.out.println("There are "+x+" duplicate elements.");


    }
}
