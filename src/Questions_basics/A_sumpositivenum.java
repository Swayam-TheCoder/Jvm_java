package Questions_basics;

import basics.A_utility;

public class A_sumpositivenum {
    //adding positive elements only
    public static void main(String[] args) {
        int[] array = A_utility.inputarray();

        int sum = 0;
        for(int i : array){
            if(i < 0){
                continue;
            }
            sum += i;
        }
        System.out.println("The sum of positive numbers are "+sum);
    }

}
