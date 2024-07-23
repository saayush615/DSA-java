public class Binarysearch {
    public static void main(String[] args) {
        int[] ar ={23,12,56,55,100,125,556};
        int tar = 100;
        System.out.println(Binary_search(ar,tar));
    }
    // binary seach
    static int Binary_search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end ){
            int mid = start + (end - start) / 2 ;
            if (arr[mid] < target){
                start = mid +1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
