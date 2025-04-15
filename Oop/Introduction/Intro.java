package DSA.Oop.Introduction;

public class Intro {
    public static void main(String[] args) {
        Student raj = new Student();
        Student rahul = new Student(1,"rahul patel",77.4f);

//        System.out.println(raj);
//        System.out.println(raj.rno);
//        System.out.println(raj.name);
//        System.out.println(raj.marks);
//
//        raj.rno = 1;
//        raj.name = "Aayush pachauri";
//        raj.marks = 90.5f;
//
//        System.out.println(raj.rno);
//        System.out.println(raj.marks);
//        System.out.println(raj.name);

        raj.changeName("Kachauri");
        raj.greeting();

        System.out.println(rahul.rno);
        System.out.println(rahul.marks);
        System.out.println(rahul.name);

        Student random = new Student(raj);

        Student one = new Student();
        Student two = one; // two is ref. variable pointing to same object as one

        one.name = "something something";
        System.out.println(two.name);

    }


}

//create a class
//for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add above properties object by object
    // we need to access every object
    void greeting() {
        System.out.println("Hello! my name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
    }

    Student (Student other) {
        this.name = other.name;
        this.marks = other.marks;
        this.rno = other.rno;
    }
    Student (){
        // It is a constructor
        this.rno = 13;
        this.name = "Raj pachauri";
        this.marks = 88.5f;

        // this is how you can call a constructor from another constructor
        // internally: new student(13,"default person",100.0f);
//        this(13,"default person",100.0f);
    }

    // Student arpit = new Student(17,"Arpit",89.7f);
    // here this will be replaced with arpit
    Student (int rno, String name, float marks){
        // It is a constructor with arguments
        this.rno = rno;
        this.name = name;
        this.marks = marks;
        // this basically mean rahul.name = name (in written in argument)
    }
}
