package assignment6;

public class Question_36 {
// work on this doesn't give accurate result
    public static void main(String[] args) {

        int []arr = new int[]{2,5,3,2,3,1,1};
        int []temp = new int[5];
        int n = 0;
        int count = 5; int a =0;

        while(n<arr.length)
        {
            for (int i = 0; i<(arr.length/2+1); i++)
            {
                if(i!=n)
                {
                    if(arr[i]== arr[n])
                    {
                        temp[a] = arr[i];
                        a++;
                    }
                }

                else
                {

                }
            }
            n++;
        }

        System.out.println("Duplicate numbers are: ");
        for(int i = 0; i<temp.length; i++)
        {
            System.out.println(" "+temp[i]);
        }


    }
}
