package DSA.Recursion.subset;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subseq("","abc");
        System.out.println(subseqRet("","abc"));
    }

    //Q1.
    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    //Q2. above same but return an array list of string
    // you can either return arraylist in argument (simple,because many refrence variable but single object) or in the body of the funciton(creating new object)
    static ArrayList<String> subseqRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);  // This is an important statement
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseqRet(p+ch,up.substring(1));
        ArrayList<String> right= subseqRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
