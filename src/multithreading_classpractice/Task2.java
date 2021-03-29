package multithreading_classpractice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task2 implements Callable {


    @Override
    public Integer call() throws Exception {
        int sum = 5;
        return sum;
    }

    public static void main(String[] args) {
        Task2 t = new Task2();
        try {
            Integer x = t.call();
            System.out.println(x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
* Difference between runnable and callable
* runnable doesn't return anything while callable returns something accordingly defined
* callable
* */