package strategies;

public class sliding_window {

    public static int maxsumsubarray(int[] arr, int k){ //array and k = window size
        int windowsum = 0;
        for(int i=0; i<k; i++){
            windowsum += arr[i];
        }

        int maxsum = windowsum;
        for(int i=k; i<arr.length; i++){
            windowsum += arr[i] - arr[i-k];
            maxsum = Math.max(windowsum, maxsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 11, 5, 1, 3, 9};

        int result = maxsumsubarray(arr, 4);

        System.out.println(result);
    }
}
