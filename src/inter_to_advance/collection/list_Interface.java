package inter_to_advance.collection;

import java.util.ArrayList;
import java.util.List;

public class list_Interface {
    public static void example1(){
        List<String> strlist = new ArrayList<>(); // <> this is generics
        strlist.add("Swayam");
        strlist.add("The great");
//        strlist.remove(1);

        if(strlist.contains("Swayam")){
            System.out.println("Swayam exists");
        } else{
            System.out.println("doesn't exists");
        }

        for(String str: strlist){
            System.out.print(str+ " ");
        }

    }


    public static void example2(){
        List strlist = new ArrayList(); // <> this is generics
        strlist.add("Swayam");
        strlist.add("The great");
//        strlist.remove(1);

        for (int i=0; i<strlist.size(); i++){
            System.out.print(strlist.get(i)+ " ");
        }
    }

    public static void main(String[] args) {
        example1();
        System.out.println();
        example2();
    }
}
