package leetcode;

import Questions_basics.A_occurences;

import java.util.*;

public class q_26 {
    //two pointer
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,3,4};
        int k = removeDuplicates(nums);
        for (int i=0; i<k; i++){
            System.out.println(nums[i]);
        }
        System.out.println("size "+k);
    }

    public static void remove(int[] nums) {    // just for understanding..
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        for(int i=0; i< nums.length; i++){
            nums[i] = list.get(i);
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }

}




// [1,2,2,2]
// [1,2,_,_]