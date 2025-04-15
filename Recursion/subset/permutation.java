package DSA.Recursion.subset;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        // Q1.
        permu("","abc");

        //Q1.(part2)
//        ArrayList<String> ans = permuList("","abc");
//        System.out.println(ans);

        //Q2.
//        System.out.println(permutationCount("","abc"));
    }
    static void permu(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        // see the notes to understand this
        for (int i = 0; i<=p.length(); i++){
            String f = p.substring(0,i);  // here i is exclusive and 0 is inclusive
            String s = p.substring(i,p.length());  // here p.length is exclusive and i is inclusive
            permu(f+ch+s,up.substring(1));
        }
    }

    static ArrayList<String> permuList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        // see the notes to understand this
        for (int i = 0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permuList(f+ch+s,up.substring(1)));
        }
        return ans;
    }

    // Q2.
    static int permutationCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        // see the notes to understand this
        for (int i = 0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permutationCount(f+ch+s,up.substring(1));
        }
        return count;
    }
}
