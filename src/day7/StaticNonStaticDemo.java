package day7;

public class StaticNonStaticDemo {

    String nonStaticVar = "This is non static variable";
    static String staticVar = "This is static variable";

    public void nonStaticMethod(){
        System.out.println("This is non-static method...");
    }

    public static void staticMethod(){
        System.out.println("This is static method...");
    }
    public static void main(String[] args) {
        // local variable
        int a = 5;
        String name = "ram";

        // System.out.println(nonStaticVar);  ---> cannot access have to make object
        StaticNonStaticDemo obj1 = new StaticNonStaticDemo();
        System.out.println(obj1.nonStaticVar);
        obj1.nonStaticMethod();

        StaticNonStaticDemo obj2 = new StaticNonStaticDemo();
        System.out.println(obj2.nonStaticVar);
        obj2.nonStaticMethod();

        //best way
        System.out.println(StaticNonStaticDemo.staticVar);
        StaticNonStaticDemo.staticMethod();

        //
        System.out.println(staticVar);
        staticMethod();
    }
}
