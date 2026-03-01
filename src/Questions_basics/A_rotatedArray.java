package Questions_basics;

public class A_rotatedArray {
    public static int findpivot(int[] arr){
        int low=0, high= arr.length-1;
        while(high > low){
            int mid = low + (high - low)/2;

            if(arr[mid] > arr[high]){
                low = mid + 1;
            } else{
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int pivotindex = findpivot(arr);
        System.out.println(pivotindex);
        System.out.println(arr[pivotindex]);
    }
}



//Rotated Array — A rotated array is a sorted array that has been rotated (shifted) around a pivot.

//Original sorted array: [1, 2, 3, 4, 5, 6, 7]
//Rotated at index 3: [4, 5, 6, 7, 1, 2, 3]

//Key Properties ⭐
//  Array is partially sorted
//  One half is always sorted
//  Used with Binary Search
//  Time complexity target → O(log n)

