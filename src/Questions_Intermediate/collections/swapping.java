package Questions_Intermediate.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class swapping {
    public static void main(String[] args) {
        List <Integer> mylist = Arrays.asList(1,2,3,4,5,6);
        System.out.println(mylist);
        swap(mylist,2,4);
        System.out.println(mylist);
    }

    public static void swap(List <Integer> mylist, int x, int y){
        int temp = mylist.get(x);
        mylist.set(x, mylist.get(y));
        mylist.set(y,temp);
    }
}
