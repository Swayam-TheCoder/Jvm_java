package strategies;

public class Kadane_algo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int current_sum = arr[0];
        int maxsum = arr[0];

        for (int i=1; i< arr.length; i++){
            current_sum = Math.max(arr[i], current_sum + arr[i]);
            maxsum = Math.max(maxsum, current_sum);
        }

        System.out.println(maxsum);
    }
}
