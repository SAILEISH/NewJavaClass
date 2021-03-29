package multithreading_classpractice;

public class ThreadDemo3 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from Thread 1 ... ");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from Thread 2 ... ");
            }
        });

        t1.start();
        t2.start();
    }
}
