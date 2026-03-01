package strategies;

import java.util.Arrays;

public class two_pointer {
    public static int remove_duplicates(int[] nums){
        int i=0;
        Arrays.sort(nums);
        for(int j=1; j< nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static boolean twoSum(int[] arr, int target) {
        int left = 0, right = arr.length-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return true;
            } else if (sum < target) {
                left++;
            } else{
                right--;
            }
        }
        return true;
    }

    public static int max_subarray(int[] arr, int k){
        int windowsum = 0;

        for(int i=0; i<k; i++){
            windowsum += arr[i];
        }

        int maxsum = windowsum;
        
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,4,5};
//        int k = remove_duplicates(nums);
//        for (int i=0; i<k; i++) {
//            System.out.println(nums[i]);
//        }

        int target = 5;
        int k = max_subarray(nums, target);
        System.out.println(k);
    }
}
