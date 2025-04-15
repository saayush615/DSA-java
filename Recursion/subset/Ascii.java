package DSA.Recursion.subset;

import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
//        char ch = 'a';
//        System.out.println(ch + 0);
//        System.out.println((char)(ch + 1));
//        subseqascii("","abc");
        System.out.println(subseqasciiRet("","abc"));
    }

    // Q1. return ascii value too with the subsets
    static void subseqascii(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseqascii(p+ch,up.substring(1));
        subseqascii(p,up.substring(1));
        subseqascii(p + (ch+0),up.substring(1));
    }

    // Q2. return ascii value too with the subsets && return it in string
    static ArrayList<String> subseqasciiRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first = subseqasciiRet(p+ch,up.substring(1));
        ArrayList<String> second = subseqasciiRet(p,up.substring(1));
        ArrayList<String> third = subseqasciiRet(p + (ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
