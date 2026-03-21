package leetcode;

public class q_1295 {

    public static int findNumbers(int[] nums) {

        int even=0;
        for(int i=0; i< nums.length; i++) {
            int count=0;
            while (nums[i] > 0) {
                nums[i] /= 10;
                count++;
            }

            if(count % 2 == 0){
                even++;
            }
        }
        return even;
    }

    public static void main(String[] args) {
        int[] nums = {292,345,2,69,7896};
        int count = findNumbers(nums);
        System.out.println(count);
//        findNumbers(nums);
    }
}
