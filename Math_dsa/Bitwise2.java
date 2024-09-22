package DSA.Math_dsa;

public class Bitwise2 {
    public static void main(String[] args) {
//        q7 : to do negetaive = first do compliment and then add 1 to it
        int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        System.out.println(times(arr));
    }

    private static int times(int[] arr) {
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        if (sum % 3 == 0){
            return -1;
        }
        return sum%3;
    }
}
