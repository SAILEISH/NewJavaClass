package day9;

/*
    shadowing: process of hiding instance variable by local variable
    inside non-static method and constructor of a class
 */

/*
* this is a keyword and is an implicit reference variable of current type and current object
* and is available inside non-static method and constructor of a class
* */

// we cannot change the value of 'this.'
public class ThisDemo1 {
    // instance variable
    int a = 5;

    public  void print(){
        System.out.println(a); // non-static variable can be called in non-static function
    }

    public static void main(String[] args) {
        ThisDemo1 obj = new ThisDemo1();
        System.out.println("obj is "+obj);
        obj.print();
    }
}
