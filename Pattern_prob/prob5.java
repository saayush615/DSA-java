package DSA.Pattern_prob;

public class prob5 {
    public static void main(String[] args) {
        int n =5;
//        int a =0;
//        for (int i = 1; i < 2 * n; i++) {
//            int col;
//            if(i <= 5){
//                col =i;
//            }
//            else{
//                a= a+2;
//                col = i - a;
//
//            }
//            for (int j = 1; j <= col; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        pat5(n);
    }

//    or

    static void pat5(int n ){
        for (int row = 0; row< 2*n; row++){
            int totalColsInRow = row > n ? 2*n - row: row;
//            if row > n print 2*2-row or if false print row
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
