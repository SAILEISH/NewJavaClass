package day12;

public class ParentChildTest {

    public static void main(String[] args) {
        Parent obj = new Parent();
        System.out.println(obj.name);
        obj.sayHello();

        //due to inheritance we can call it by child's object
        Child obj1 = new Child();
        System.out.println(obj1.name);
        obj.sayHello();
    }
}
