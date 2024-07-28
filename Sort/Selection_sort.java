package DSA.Sort;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2,6};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
//            find the max item in the remaining array and swap with correct index;
            int last = arr.length -i -1;
            int max = getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }

    private static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max =i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
