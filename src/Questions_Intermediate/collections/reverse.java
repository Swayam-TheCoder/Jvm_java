package Questions_Intermediate.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverse {
    public static void main(String[] args) {
        List <Integer> mylist = Arrays.asList(1,2,3,4,5);
        System.out.println(mylist);
        reverse(mylist);
        System.out.println(mylist);
    }

    public static void reverse(List <Integer> mylist){
//        Collections.reverse(mylist);

        for(int i=0; i<mylist.size()/2; i++){
            swapping.swap(mylist,i,mylist.size()-1-i);
        }
    }
}
