package leetcode;

import java.util.Arrays;

// Working

public class q_1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i=0;i< nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 17;
        int[] arr = twoSum(nums, target);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
