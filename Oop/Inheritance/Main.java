package DSA.Oop.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4.6,5.2,6.6);
//        Box box2 = new Box(box1);
//
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,8);
//        System.out.println(box3.h + " " + box3.weight);

        Box box5 = new BoxWeight(2,3,4,8);
//        System.out.println(box5.weight);  this will not work
        System.out.println(box5.w); // this will work

        // Box box5 = new BoxWeight(2,3,4,8); => This is refrence type of Box and refrencing to Boxweight
//        all the member of Box(parent class) can be accessed but all the member of Box weight(child class) can't be accessed
//        It means it not the type of object(Box weight) that detemine , it will be the type of refrence variable

//        BoxWeight box6 = new Box(2,3,4); // Error => bcoz you are trying to refrence child to the parent

//        * Indetail (by kunal kushwaha)
        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error


        BoxPrice box = new BoxPrice(5,8,200);

    }
}
