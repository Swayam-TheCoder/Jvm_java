package inter_to_advance.collection;

import java.util.Collection;

public class utility {
    public static <E> void print(Collection<E> collection){
        System.out.println("Collection is: ");
        for(E coll: collection){
            System.out.printf(coll+" ");
        }
        System.out.println();
    }
}
