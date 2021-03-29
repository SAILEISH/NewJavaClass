package multithreading_classpractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTest {

    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(3); // in pool there is 3 for limit but we call 5 different threads
        executors.execute(new Task1("Task1"));
        executors.execute(new Task1("Task2"));
        executors.execute(new Task1("Task3"));
        executors.execute(new Task1("Task4"));
        executors.execute(new Task1("Task5"));

        executors.shutdown();


    }
}
