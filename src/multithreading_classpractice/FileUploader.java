package multithreading_classpractice;

// FileUploader is a thread
public class FileUploader extends Thread{

    private String name;

    public FileUploader(String name){
        this.name = name;
    }

    public void run(){
        FileUpload f = new FileUpload();
        f.upload (this.name);
    }
}
