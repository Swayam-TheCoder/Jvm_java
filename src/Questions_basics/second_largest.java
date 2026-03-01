package Questions_basics;

public class second_largest {
    public static void main(String[] args) {
        int[] arr = {3,5,4,8,9,2};
        int second = secondlargest(arr);
        System.out.println(second);
    }

    public static int secondlargest(int[] arr){
        int largest = 0;
        for (int i=0; i< arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        // largest = 9
        int secondlargest = 0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i] > secondlargest && arr[i] != largest){
                secondlargest = arr[i];

            }
        }
        return secondlargest + largest;
    }
}

// arr[] = [12, 35, 1, 10, 34, 1]
// 34