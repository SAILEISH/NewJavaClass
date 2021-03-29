package multithreading_classpractice;

public class FacebookLikeTest {

    public static void main(String[] args) {
        FacebookLike fb =  new FacebookLike(300);

        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {
                fb.increaseLikes();
            }
        });

        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {
                fb.increaseLikes();
            }
        });

        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {
                fb.increaseLikes();
            }
        });

        Thread user4 = new Thread(new Runnable() {
            @Override
            public void run() {
                fb.increaseLikes();
            }
        });

        user1.start();
        user2.start();
        user3.start();
        user4.start();


    }
}
