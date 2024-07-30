package DSA.Sort;

class Solution_cycle {
    public static void main(String[] args) {
        int[] input = {3, 0, 1};
        int a = missingNumber(input);
        System.out.println(a);
    }

    // missing number in an array
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }

        }

        //  check
        for(int j = 0; j< nums.length;j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;

    }
}