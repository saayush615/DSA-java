package DSA.Math_dsa;


public class Bitwise1 {
    public static void main(String[] args) {
//        System.out.println(10 << 1);
//        int n =15;
//        System.out.println(10>n? "yes" : "no");

//        q1
//        int n = 55;
//        System.out.println(isOdd(n));

//        q2
//        int[] arr = {2,3,3,4,2,6,4};
//        System.out.println(ans(arr));

//        q4: find i'th bit : count from backwards
//        int num = 19;
//        System.out.println(Integer.toBinaryString(num));
//        int position = 2;
//        System.out.println(find_bit(num, position));

//        q5:set
//        int num = 19;
//        System.out.println(Integer.toBinaryString(num));
//        int position = 4;
//        System.out.println(Integer.toBinaryString(set_bit(num, position)));

//        q6:reset
//        int num = 19;
//        System.out.println(Integer.toBinaryString(num));
//        int position = 2;
//        System.out.println(Integer.toBinaryString(reset_bit(num, position)));

//        question 10 (imp concept)
//        int n = 34567;
//        int b = 10;
//        int ans = (int)(Math.log(n) / Math.log(b));
//        System.out.println(ans);

//        q11:pascal triangle
//        int n = 5; // Example: 5th row of Pascal's Triangle(starting from the 1st row)
//        int sum = sumOfNthRowInPascalsTriangle(n);
//        System.out.println("Sum of the " + n + "th row in Pascal's Triangle is: " + sum);
    }


    //q1
    private static boolean isOdd(int n) {
        return (n&1) == 1;
    }

    //q2
    private static int ans(int[] arr) {
        int unique = 0;
//        just xor every no.
        for (int n : arr){
            unique ^= n;
        }
        return unique;
    }

    //q4
    private static int find_bit(int num, int pos) {
        return (num & (1 << (pos - 1))) >> (pos - 1);
        // or
//        return (num >> (pos -1)) & (pos -1);
    }

    // q5 :set
//    private static int set_bit(int num, int position) {
//        return num | (1<<(position - 1));
//    }

//    q6 : reset
//    private static int reset_bit(int num, int pos) {
//        return num & ~(1 << (pos-1));
//    }

//    q11: pascal triangle
//    private static int sumOfNthRowInPascalsTriangle(int n) {
//        return 1 << n-1;  // This is equivalent to 2^n
//    }
}
