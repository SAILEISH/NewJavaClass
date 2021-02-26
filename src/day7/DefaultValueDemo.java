package day7;

public class DefaultValueDemo {
    byte b;
    static int i;
    DefaultValueDemo ob;

    public static void main(String[] args) {
        DefaultValueDemo obj = new DefaultValueDemo();
        System.out.println(obj.b);
        System.out.println(i);

        int a;

        // System.out.println(a); local variable has no default value
    }


}
