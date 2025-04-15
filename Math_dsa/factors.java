package DSA.Math_dsa;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        factor3(20);
    }

    // brute force
//    static void factor1(int n){
//        for (int i = 1; i <= n; i++) {
//            if (n%i == 0){
//                System.out.print(i + " ");
//            }
//        }
//    }


    // better approach
    // o(sqrt(n))
//    static void factor2(int n){
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if (n%i == 0){
//                // the down if condition is there bcoz it avoid adding value 2 times like in case of 36 it will add 6
//                   two times there . so if 36/6 = 6 which means 6*6 = 36 then print 6 only one time
//                if (n / i == i) {
//                    System.out.print(i+ " ");
//                }else {
//                    System.out.print(i + " " + n / i + " ");
//                }
//            }
//        }
//    }


    // both time and space with be O(sqrt(n))
    static void factor3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i == 0){
                // this is else is to avoid the repeating of number for ex: if 36 it will print 6 two times
//               or simply ignorig the dublicate roots
                if (n / i == i) {
                    System.out.print(i+ " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() -1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
