package DSA.Recursion;

public class febonacci {
    public static void main(String[] args) {
        // to understand the recurtion make the recursive tree and debug to see the flow
        int ans = fibo(4);
        System.out.println(ans);
    }

    static int fibo(int n){
        // base conditiion
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
