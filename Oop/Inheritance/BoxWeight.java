package DSA.Oop.Inheritance;

public class BoxWeight extends Box {

    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight (double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this ? => call the parent class constructor with l,h,w as a parameter
//        used to initialize values present in parent class

        System.out.println(super.w); // second use case of super. help to refer parent variable
        this.weight = weight;
    }
}
