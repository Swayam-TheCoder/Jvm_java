package DSA.Hashmap;

import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,2,1,4};
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }
}
