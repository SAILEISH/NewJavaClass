package multithreading_classpractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 implements Runnable{

    private String name;
    public Task1(String name){
        this.name = name;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm::ss a");
        for(int i = 0; i<=5; i++){
            if(i==0)
            {
                System.out.println("initialization time for: "+name+" "+sdf.format(new Date()));
            }

            else{
                System.out.println("running time for: "+name+" "+sdf.format(new Date()));
            }
        }

        System.out.println(name+" completed.");
    }
}
