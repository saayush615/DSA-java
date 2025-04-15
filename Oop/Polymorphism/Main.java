package DSA.Oop.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Shapes circle = new Circle();  // refrence type is of parent calss(Shapes) and object is of type child class(Circle)
        // which perticular method will be called that depend on object
        // which can be accessed is defind by the refrence type
        Square square = new Square();

        square.area();


    }
}
