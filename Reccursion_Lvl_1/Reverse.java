package DSA.Reccursion_Lvl_1;

public class Reverse {
    // 1. first reverse method ( with extra variable outside)
    static int sum = 0;
    static void rev1(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }

    // 2. mehod 2
    static int rev2(int n){
//        sometime you might need some additional variable in the argument in the case , make another function
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10. digits-1);
    }

    public static void main(String[] args) {
        // 1.
//        rev1(1234);
//        System.out.println(sum);
        //2.
        System.out.println();
    }
}
