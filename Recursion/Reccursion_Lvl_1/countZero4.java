package DSA.Recursion.Reccursion_Lvl_1;

public class countZero4 {
    public static void main(String[] args) {
//        Q9 method1
//        count(2090506070);
//        System.out.println(sum);

//        Q9 method 2(good question and important method)
        System.out.println(count(30210));
    }
//    Q9 method 1:
//    static int sum = 0;
//    static void count(int n){
//        if (n/10 == 0){
//            return;
//        }
//        if(n%10 == 0){
//            sum++;
//        }
//        count(n/10);
//    }

//    Q9 method 2(good question and important concept)
    static int count(int n){
        return helper(n,0);
    }
    private static int helper(int n, int c){
        if (n == 0){
            return c;
        }

        int rem = n%10;
        if (rem == 0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
