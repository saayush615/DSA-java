package DSA.Sort;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2,6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        // outer loop
        for (int i = 0; i < arr.length - 1; i++) {
            // inner loop
            for (int j = i+1; j > 0; j--) {
//                check if prev ele is greater than this elment if yes then swap
                if (arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int second,int first){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
