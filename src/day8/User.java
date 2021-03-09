package day8;

public class User {

    String name;
    int age;
// constructor overloading: in one class if you have one or more than one constructor
    public User(){
        System.out.println("Default (no-arg) constructor.");
    }

    public User(String n, int a){
        name = n;
        age = a;

        System.out.println("Augmented (parameterized) constructor.");
    }

    public User(String name)
    {
        // this is example of constructor overloading
        System.out.println("Different argument passed but this is also an augmented constructor.");
    }

    public static void main(String[] args) {
        User user1 = new User();

        System.out.println(" =============== ");

        User user2 = new User("Ram", 23);

    }
}
