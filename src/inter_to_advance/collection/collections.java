package inter_to_advance.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collections {
    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<>();
        // AAM JINDAGI
        //        numlist.add(9);
//        numlist.add(5);
//        numlist.add(3);
//        numlist.add(7);

        // Mentos jindagi
        Collections.addAll(numlist, 9,5,3,7);
        Collections.sort(numlist);
        utility.print(numlist);
        Collections.reverse(numlist);
        utility.print(numlist);
        System.out.println(Collections.max(numlist));
        System.out.println(Collections.min(numlist));

        //Learn about unmodifiable list
        // That concept is remainin..

    }
}
