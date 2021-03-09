package day8;

public class Student {

    String name;
    int roll;

    /*public void assignInfo(String n, int r)
    {
        name = n;
         roll = r;
    }*/
        //constructor -- runs only once for each object
    public Student(String n, int r)
    {
        name = n;
        roll = r;
        System.out.println("Constructor called: ");
    }

    public void displayInfo()
    {
        System.out.println("Name is: "+name);
        System.out.println("Roll is: "+roll);
        System.out.println(" ===================== ");
    }

    public static void main(String[] args) {
        Student student1 = new Student("ram", 33);
        student1.displayInfo();

        Student student2 = new Student("shyam", 43);

        student2.displayInfo();
    }
}
