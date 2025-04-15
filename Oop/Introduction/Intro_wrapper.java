package DSA.Oop.Introduction;

public class Intro_wrapper {
    public static void main(String[] args) {
        int a = 10; // here int is datatype and a is variable
        int b = 20;
        Integer num = 45; // now num is an object which contain value of 45, being an object provides so many properties and function
        // Upperone is same as Interger num = new Integer(45);
//        num.

        swap(a,b); // this swap will not work because in primitives there is only pass by value no such thing as pass by refrence.
        System.out.println(a + " " + b);

        // final keyword
        final int brag = 5; // this brag variable cannot be changed it is final
//        brag = 6; // error becoz final cannot be changed

//        final A kunal = new A("Kunal Kushwaha");
//        kunal.name = "other name";

        // when a non primitive is final, you cannot reassign it.
//        kunal = new A("new object");


    }
    static void swap( int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
}
class A {
    final int num = 10;
    String name;
}
