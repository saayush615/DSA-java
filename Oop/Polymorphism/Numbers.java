package DSA.Oop.Polymorphism;

public class Numbers {

    double sum(double a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(2,3); // why 2 being integer is accepted by double and converted in double (this is becasue of typecasting)
        obj.sum(1,3,7);
    }
}
