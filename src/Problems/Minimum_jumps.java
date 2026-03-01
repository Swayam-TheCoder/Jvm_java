package Problems;

public class Minimum_jumps {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        int maxindex = 0;
        int count = 0;
        for (int i=0; i<arr.length; i++){
            if(i > maxindex){
                System.out.println("not possible");
                return;
            }
            maxindex = Math.max(maxindex, i + arr[i]);
            count++;
        }

        System.out.println(count);
    }
}
