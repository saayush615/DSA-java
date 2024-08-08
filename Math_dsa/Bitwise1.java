package DSA.Math_dsa;


public class Bitwise1 {
    public static void main(String[] args) {
//        System.out.println(10 << 1);
//        int n =15;
//        System.out.println(10>n? "yes" : "no");

//        q1
//        int n = 67;
//        System.out.println(isOdd(n));

//        q2
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }

    //q1
//    private static boolean isOdd(int n) {
//        return (n&1) == 1;
//    }

    //q2
    private static int ans(int[] arr) {
        int unique = 0;
//        just xor every no.
        for (int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
