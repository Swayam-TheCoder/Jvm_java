package DSA.Hashmap;


import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap <Integer, String> map = new HashMap<>();
        map.put(1, "swayam");
        map.put(2, "AR");
        map.put(3, "AY");
        map.put(4,"abc");

        System.out.println(map.get(3));
        System.out.println(map.containsKey(4));
        map.remove(4);

        System.out.println(map);
    }
}
