package inter_to_advance.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Swayam", 9);
        map.put("Pk", 17);
        map.put("Ram", 15);
        map.put("Shyam", 60);
        System.out.println(map.size());
        System.out.println(map.get("Swayam"));
        System.out.println(map.get("Sw"));
        System.out.println(map.containsKey("PK"));
        map.remove("Pk");
        System.out.println(map.size());

        for(String key: map.keySet()){
            System.out.println(key+ " " +map.get(key));
        }

    }
}
