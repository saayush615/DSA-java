package DSA.Recursion.MergeSort;

import java.util.Arrays;

public class Mergesort_inPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergesortinplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergesortinplace(int[] arr, int s, int e){
        if (e-s == 1){
            return;
        }

        int mid = (s + e) /2;
        mergesortinplace(arr,s,mid);  // first part of arr
        mergesortinplace(arr,mid,e);  // second part of arr
        mergeinPlace(arr,s,mid,e); // merge these array and return
    }

    // merge is the functoin to merge two array left and right
    private static void mergeinPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e - s];
        // i,j are the pointers of left and right respectivily
        int i = s;
        int j = m;
        // k is the pointer of the mix array
        int k = 0;
        // if i or j any exeed their length break the loop
        while (i < m && j < e) {
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // it may be possible that array is not completed
        // copy the remainig arrays
        while (i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        // understand this, this is important
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
