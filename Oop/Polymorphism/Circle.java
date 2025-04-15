package DSA.Oop.Polymorphism;

public class Circle extends Shapes {

    // this will run when obj of circle is created
    // hence it is overriding the parent
    @Override // this is called annotation
    void area(){
        System.out.println("area is pie*r**square");
    }
}
