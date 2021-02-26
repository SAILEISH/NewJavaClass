package day7;

public class ObjectDemo2 {
    int a;
    String s;
    public static void main(String[] args) {
        System.out.println(new ObjectDemo2());
        System.out.println(new ObjectDemo2().a);
        System.out.println(new ObjectDemo2().s);


        System.out.println(" ========================= ");
        ObjectDemo2 ob;
        ob = new ObjectDemo2();
        System.out.println(ob);
        System.out.println(new ObjectDemo2().a);
        System.out.println(new ObjectDemo2().s);

        System.out.println(" ========================= ");
        ObjectDemo2 obj = new ObjectDemo2();
        System.out.println(obj);
        System.out.println(new ObjectDemo2().a);
        System.out.println(new ObjectDemo2().s);
    }
}
