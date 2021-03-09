package day12;

public class Child extends Parent{

    String name = "Child's name";

    public void sayHello()
    {
        System.out.println("Hello from Child!");
        super.sayHello();
        System.out.println(name);
        System.out.println(super.name);
    }
}
