package DSA.Recursion.MergeSort;

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] ans = mergesort(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(arr)); // original array was not modified
    }

    static int[] mergesort(int[] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length /2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));  // copy a new array with the specified range.
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right); // merge this array and return
    }

    // merge is the functoin to merge two array left and right
    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        // i,j are the pointers of left and right respectivily
        int i = 0;
        int j = 0;
        // k is the pointer of the mix array
        int k = 0;
        // if i or j any exeed their length break the loop
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible that array is not completed
        // copy the remainig arrays
        while (i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
