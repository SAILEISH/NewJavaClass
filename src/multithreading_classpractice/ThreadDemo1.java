package multithreading_classpractice;

public class ThreadDemo1 extends Thread {

    @Override
    public void run() {
        System.out.println("hello from thread ... ");
    }

    public static void main(String[] args) {
        // new state
        ThreadDemo1 t1 = new ThreadDemo1();
        ThreadDemo1 t2 = new ThreadDemo1();
        ThreadDemo1 t3 = new ThreadDemo1();

        // runnable state
        t1.start();// start calls run internally -- running state
        t2.start();
        t3.start();

    }
}
