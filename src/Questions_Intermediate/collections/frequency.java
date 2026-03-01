package Questions_Intermediate.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class frequency {
    public static void main(String[] args) {
        List<Integer> strlist = Arrays.asList(1,2,3,4,5,1,2,1,2,4,1,2);
        int freq = Collections.frequency(strlist, 1);
        System.out.println(freq);
        System.out.println(Collections.frequency(strlist,4));
    }
}
