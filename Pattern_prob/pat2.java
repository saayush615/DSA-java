package DSA.Pattern_prob;

public class pat2 {
    public static void main(String[] args) {
        pattern2(4);
    }
    static void pattern2(int n){
//        how many times my lines will run
        for (int row = 1; row <= n ; row++) {
//            for every row run the coloumn
            for (int j = 1; j <= row; j++) {
//                find what need to be printed
                System.out.print("*");
            }
//            when one row is printed, we need to add a new line
            System.out.println();
        }
    }
}
