package Questions_basics;

public class A_rotatedSearch {
    public static int search(int[] arr, int target){
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(target == arr[mid]){
                return mid;
            }

            // left half sorted
            if(arr[low] <= arr[mid]){
                if(target < arr[mid] && target >= arr[low]){
                    high = mid - 1;
                } else{
                    low = mid + 1;
                }
            }
            // right half sorted
            else{
                if(target > arr[mid] && target <= arr[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int result = search(arr, target);

        if(result != -1) {
            System.out.println("found at "+result);
        } else{
            System.out.println("Target Not found");
        }
    }
}
