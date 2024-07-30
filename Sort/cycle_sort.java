package DSA.Sort;

import java.util.Arrays;

public class cycle_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2,6};
        Cycle_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Cycle_sort(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int first, int secoond){
        int temp = arr[first];
        arr[first] = arr[secoond];
        arr[secoond] = temp;
    }
}
