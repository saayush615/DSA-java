package DSA.Recursion;

public class Recursion2 {
    public static void main(String[] args) {
        // print first 5 number: 1,2,3,4,5
        print(1);
    }
    static void print(int n){
        //base condition
        if (n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // recursive call:
        // this called tail recursion -> this is the last funciton call
        print(n+1); // -> if you are calling a function again and again, you can treat it as a seprate call in the stack
    }
}
