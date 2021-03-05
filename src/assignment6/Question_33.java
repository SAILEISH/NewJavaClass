package assignment6;

public class Question_33 {

    public static void main(String[] args) {

        int []arr = new int[]{4,5,10,2,3};
        int []temp = new int[1];
        int n = 0;// assume this is the total number of elements in the array

        while(n<5)
        {
            for(int i = 0; i<arr.length;i++)
            {
                if(arr[i]>arr[n]) // initial condition: i=1 - n=0
                {//swap
                    temp[0] = arr[n]; //save
                    arr[n] = arr[i];
                    arr[i] = temp[0];
                }
            }
        n++;
        }

        for(int i = 0; i<n; i++){

            System.out.println(arr[i]);
        }

    }

}
