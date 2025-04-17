package DSA.Math_dsa;

public class Prime_no {
    public static void main(String[] args) {
        // Q1 :
//        int n = 8;
//        boolean isprime = true;
//        for (int i = 2; i < n ; i++) {
//            if(n%i == 0){
//                isprime = false;
//                break;
//            }
//        }
//        if (isprime) {
//            System.out.println("The number is prime");
//        }
//        else {
//            System.out.println("the number is not prime");
//        }

        //Q2: If prime then true otherwise false
//        int n = 20;
//        for (int i =1; i <= n ; i++){
//            System.out.println(i + " " + isprime(i));
//        }

//        Checking one number: O(√n)
//         Looping from 1 to n: O(n√n)

//        Q3:(brute force) print only prime no.
//        int n = 20;
//        for (int i =1; i <= n ; i++){
//            if(isprime2(i)){
//                System.out.print(i + " ,");
//            }
//        }
//
//        Q3:(optimal)(seive of erathonasis)
        int n = 40;
        boolean[] primes = new boolean[n+1];
        seive(n,primes);

    }

    // Q2: to find that all number lying between a given no. is prime or not
//    static boolean isprime(int n){
//        if (n <= 1){
//            return false;
//        }
//
//        int c = 2;
//        while( c * c <= n) {   // c < (n)^1/2
//            if(n % c == 0){
//                return false;
//            }
//            c++;
//        }
//        return true;
//    }

    // Q3:(brute force)
//    static boolean isprime2(int n){
//        if (n <= 1){
//            return false;
//        }
//
//        int c = 2;
//        while( c * c <= n) {   // c < (n)^1/2
//            if(n % c == 0){
//                return false;
//            }
//            c++;
//        }
//        return true;
//    }


    // Q3: (optimal approach)
    // false in array means the no. is prime, true is no. is not prime
    static void seive(int n, boolean[] primes){
        for (int i = 2; i*i <= n; i++) {
            if(!primes[i]){ // initially boolean will contain all the value as false
                for (int j = i*2; j <= n ; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n ; i++) {
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }

    }



}
