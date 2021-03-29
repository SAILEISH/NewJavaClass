package multithreading_classpractice;

public class ThreadDemo4 extends Thread{

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

        ThreadDemo4 t1 = new ThreadDemo4();
        ThreadDemo4 t2 = new ThreadDemo4();
        ThreadDemo4 t3 = new ThreadDemo4();

        t1.start();
        t2.start();
        t3.start();
    }
}

/*
* output: blocked condition -- delays the output because of thread.sleep(1000 in millisecond)
* */
