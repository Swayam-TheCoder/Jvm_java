package leetcode;

public class q_137 {
    public static void main(String[] args) {
        int[] num = {2,2,3,2};
        int result = 0;
        for(int i=0; i<32; i++){
            int count = 0;

            for (int number : num) {
                if((number & (1 << i)) != 0){
                    count++;
                }
            }

            if(count % 3 != 0){
                result = result | (1<<i);
            }
        }
        System.out.println(result);
        }
    }
