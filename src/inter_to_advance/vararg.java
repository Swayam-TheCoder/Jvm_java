package inter_to_advance;

public class vararg {
    public void printmany(String ...elements){
        for(String items: elements){
            System.out.print(items+ " ");
        }
        System.out.println();
    }

    public void sum(int first, int second, int ...ar  ){
        int sum = first + second;
        for(int i: ar){
            sum += i;
        }
        System.out.println("Sum is "+sum);
    }

    public static void main(String[] args) {
        vararg v = new vararg();
        System.out.println("Example 1: ");
        v.printmany("My","name","is","Swayam","Sagarkar");
        v.printmany("Apple", "mango", "Rasgulla","chocolates");
        v.printmany();
        v.printmany(new String[]{"one", "two", "three"});
        v.printmany("Apple", "mango", "Rasgulla","chocolates");

        System.out.println("Example 2: ");
        v.sum(1,2,3,4,5);
        v.sum(1,2);
        v.sum(1,2,3,4,5,6,7,8,9,10);
    }
}
