package DSA.Recursion;

public class Recursion1 {
    public static void main(String[] args) {
//         print first 5 number: 1,2,3,4,5
        print1(1);


//        String s = "Aayush singh, $";
//        char c = s.charAt(1);
//        System.out.println(s.length());
//
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//        sb1.append("This is 1");
//        sb2.append("this is 2");
//        System.out.println(sb1 );
//        System.out.println(sb2);
//        System.out.println(sb1.reverse());

    }

    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
}
