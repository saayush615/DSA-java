package DSA.Reccursion_Lvl_1;

public class concept2 {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
//        fun(n--); // => infinte loop

//        n-- vs --n
        fun(--n);
    }
}
