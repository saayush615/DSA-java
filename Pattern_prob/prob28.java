package DSA.Pattern_prob;

public class prob28 {
    public static void main(String[] args) {
        int n =5;
        pat28(n);
    }


    // Hard question
    static void pat28(int n ){
        for (int row = 0; row< 2*n; row++){
            int totalColsInRow = row > n ? 2*n - row: row;

            // to print number of spaces;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
