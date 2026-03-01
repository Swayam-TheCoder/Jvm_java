package inter_to_advance.collection;

import java.util.HashSet;
import java.util.Set;

public class set_Interface {
    public static void main(String[] args) {
        Set <String> names = new HashSet<>();
        names.add("Apple");
        names.add("mango");
        utility.print(names);
        System.out.println(names.size());
        names.add("banana");
        System.out.println(names.size());
        System.out.println(names.contains("Apple"));

    }
}
