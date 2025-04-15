package DSA.Recursion.Array;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {2,4,1,4,5};
//        System.out.println(search(arr,4,0));
//
//        System.out.println(searchIndex(arr,4,0));
//
//        System.out.println(searchIndexLast(arr,4,arr.length -1));
//
//        searchAllIndex(arr,4,0);
//        System.out.println(list);

//        System.out.println(searchAllIndex(arr,4,0,new ArrayList<>()));

        System.out.println(searchAllIndex2(arr,4,0));

    }
    // target is present or not true or false
//    private static boolean search(int[] arr,int target, int index){
//        if (index == arr.length){
//            return false;
//        }
//        return arr[index] == target || search(arr,target,index + 1);
//    }
    // search the index from index 0 to ..
//    private static int searchIndex(int[] arr,int target, int index){
//        if (index == arr.length){
//            return -1;
//        }
//        if (arr[index] == target){
//            return index;
//        }
//        else {
//            return searchIndex(arr,target,index + 1);
//        }
//    }
    // search from backward (index of the target)
//    private static int searchIndexLast(int[] arr,int target, int index){
//        if (index == -1){
//            return -1;
//        }
//        if (arr[index] == target){
//            return index;
//        }
//        else {
//            return searchIndex(arr,target,index - 1);
//        }
//    }

    // all the indexes where the index is present
//    static ArrayList<Integer> list = new ArrayList<>();
//    private static void searchAllIndex(int[] arr,int target, int index){
//        if (index == arr.length){
//            return;
//        }
//        if (arr[index] == target){
//            list.add(index);
//        }
//        searchAllIndex(arr,target,index + 1);
//    }
    // (it is another way to take arraylist in argument and return it)(#Important)return the arraylist
//    private static ArrayList<Integer> searchAllIndex(int[] arr,int target, int index, ArrayList<Integer> list){
//        if (index == arr.length){
//            return list;
//        }
//        if (arr[index] == target){
//            list.add(index);
//        }
//        return searchAllIndex(arr,target,index + 1, list);  // all return to same object
//    }

    // (it is another way without taking arraylist in argument)(#V.imp)return the arraylist
    private static ArrayList<Integer> searchAllIndex2(int[] arr,int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = searchAllIndex2(arr,target,index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
