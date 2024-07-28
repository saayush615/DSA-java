package DSA.Sort;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] array = {5,3,4,2,1};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubble(int[] arr){
        boolean swapped ;

//        run the steps n-1 times ;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
//            for each step max item will come at last respective index
            for (int j = 1; j < arr.length - i; j++) {

//                swap if prev. element is greater;
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
//            if you didnot swap for a particular value of i it means array is sorted hence stop the program;
            if(!swapped){// !false == true;
                break;
            }
        }
    }
}
