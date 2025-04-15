package DSA.Recursion.subset.google;

import java.util.ArrayList;

public class LetterPhoneNo {
    public static void main(String[] args) {
        //https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
//        pad("","12");
        System.out.println(padRet("","12"));
    }
    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        for (int i = (digit -1)*3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            pad(p+ch , up.substring(1));
        }
    }

    static ArrayList<String> padRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit -1)*3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p+ch , up.substring(1)));
        }
        return list;
    }
}
