package DSA.Binary_search;

public class BinaryorderAgnos {
    public static void main(String[] args) {
        int[] ar ={500,120,110,100,26,22,10};
        int tar = 100;
        System.out.println(Agnostic(ar,tar));
    }
    // order agonostic bianry search to find min
    static int Agnostic(int[] arr, int target) {
        if (arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        boolean is_acc = arr[start] < arr[end];
        while(start<=end){
            int mid = (start + end )/2;
            if (is_acc){
                if(target<arr[mid]){
                    end = mid -1;
                }
                else if (target>arr[mid]) {
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            } else {
                if(target<arr[mid]){
                    start = mid + 1;
                }
                else if (target>arr[mid]) {
                    end = mid -1;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
