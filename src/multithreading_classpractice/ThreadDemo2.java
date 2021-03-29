package multithreading_classpractice;

public class ThreadDemo2 implements Runnable{ // implements the instance and extends the class
// we can implement multiple instance separated by comma but cannot extend more than one class
    @Override
    public void run(){
        System.out.println("Hello from thread ... ");
    }

    public static void main(String[] args) {
        // this is different from ThreadDemo1 -- extends class and implements function
        ThreadDemo2 th1 = new ThreadDemo2();
        ThreadDemo2 th2 = new ThreadDemo2();
        ThreadDemo2 th3 = new ThreadDemo2();
        // here th1 doesn't have direct start method because th1 implements runnable method
        // runnable method only has run state and doesn't have start state

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        Thread t3 = new Thread(th3);

        t1.start();
        t2.start();
        t3.start();
    }
}
