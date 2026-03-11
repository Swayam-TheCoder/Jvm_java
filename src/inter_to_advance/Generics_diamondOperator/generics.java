package inter_to_advance.Generics_diamondOperator;

class Box<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}



public class generics {

    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
    }
    
    public static void main(String[] args) {
        Box<String> b = new Box<String>();
        b.set("Java");
        System.out.println(b.get());
    }
}
