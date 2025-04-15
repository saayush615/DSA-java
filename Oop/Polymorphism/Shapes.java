package DSA.Oop.Polymorphism;

public class Shapes {
    void area(){
        System.out.println("I am in shape");
    }

    // you cannot override a method which has a final in it

    // Early binding: check notes
//    final void area(){
//        System.out.println("I am in shape");
//    }
}
