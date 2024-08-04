package DSA.Pattern_prob;

public class prob6 {
    public static void main(String[] args) {
        int end = 5;
        for (int rows = 1; rows <= end; rows++) {

            for (int col = 0; col < end ; col++) {
                if(col < end-rows){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
