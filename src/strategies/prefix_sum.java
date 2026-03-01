package strategies;

public class prefix_sum {

    public static int[] prefix(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }

    public static int pre_sum(int[] prefix, int L, int R){
        if(L==0){
            return prefix[R];
        }
        return prefix[R] - prefix[L-1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefix = prefix(arr);
        for(int i: prefix){
            System.out.print(i+" ");
        }
        System.out.println();
        int L1 = 1, R1 = 3;
        System.out.println(pre_sum(prefix, L1, R1));
        int L2 = 0, R2= 4;
        System.out.println(pre_sum(prefix, L2, R2));

    }
}
