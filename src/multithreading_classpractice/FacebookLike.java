package multithreading_classpractice;

public class FacebookLike {

    private int likes;

    public FacebookLike(int likes){
        this.likes = likes;
    }

    public synchronized void increaseLikes(){
        try {

            System.out.println(likes++);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
