package day7;

public class ObjectDemo3 {

    public static void main(String[] args) {
        System.out.println(new ObjectDemo3().hashCode());
        ObjectDemo3 ob;
        ob = new ObjectDemo3();
        System.out.println(ob.hashCode());
        ObjectDemo3 obj = new ObjectDemo3();
        System.out.println(obj.hashCode());
        System.out.println(obj);
        System.out.println("day7.ObjectDemo3@"+Integer.toHexString(obj.hashCode()));
        // hashing in data structure
    }
}
