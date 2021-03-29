package multithreading_classpractice;

public class FileUploadTest {


    public static void main(String[] args) {
        FileUploader f1 = new FileUploader("file1");
        FileUploader f2 = new FileUploader("file2");
        FileUploader f3 = new FileUploader("file3");

        f1.start();
        f2.start();
        f3.start();
    }
}
