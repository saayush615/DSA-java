package DSA.Math_dsa;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(224,105));
//        System.out.println(lcm(9,18));
        int N = 54564;
        System.out.println(5/10);
    }
    static int gcd(int a, int b){
        if (a == 0){
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a , int b){
        return a * b / gcd(a,b);
    }
}
