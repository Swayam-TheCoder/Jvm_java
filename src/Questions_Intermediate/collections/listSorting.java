package Questions_Intermediate.collections;

import java.util.*;

public class listSorting {

//    public static void sortindec(List<String> strlist){
//        Collections.sort(strlist);
//        Collections.reverse(strlist);
//        //but I have to use comparator
//    }

    //It doesn't necessary to use a comparator..
    public static void sortindec(List<String> strlist){
        Collections.sort(strlist, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)){
                    return 0;
                } else if(o1.charAt(0) < o2.charAt(0)){
                    return -1;
                } else {
                    return 1;
                }
            }
        });
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("mango","apple", "banana", "litchi");
        System.out.println(list);
        sortindec(list);
        System.out.println(list);
    }
}
