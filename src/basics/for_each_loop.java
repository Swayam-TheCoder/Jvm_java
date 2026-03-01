package basics;

public class for_each_loop {
    public static void main(String[] args) {
        String[] array = new String[]{
            "Swayam", "Ram", "Shyam", "HelloWorld"
        };
        printarrayForEach(array);
        printarrayFor(array);
    }

    public static void printarrayForEach(String[] array){   // using for Each Loop
        for(String i : array){
            System.out.println(i+ "  ");
        }
    }

    public static void printarrayFor(String[] array){      // using for Loop
        System.out.println();
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]+ "  ");
        }
    }
}
