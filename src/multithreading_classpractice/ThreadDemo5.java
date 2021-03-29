package multithreading_classpractice;

public class ThreadDemo5 extends Thread{

    @Override
    public void run(){
        for (int i = 1; i<=5; i++)
        {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo5 t1 = new ThreadDemo5();
        ThreadDemo5 t2 = new ThreadDemo5();
        ThreadDemo5 t3 = new ThreadDemo5();

        t1.start();
        try {
            t1.join(); //
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
