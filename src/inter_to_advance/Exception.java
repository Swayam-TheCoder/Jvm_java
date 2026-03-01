package inter_to_advance;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
        int fi = sc.nextInt();
        int se = sc.nextInt();
        try {
            int result = fi / se;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("message: "+e.getMessage());
        }

        try {
            int[] a = new int[5];
            System.out.println("hello");
            a[6] = fi / se;
            System.out.println("Result is " + a[6]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch(Throwable th){
            System.out.println("Throwable"+th);
        }
    }
}


//try–catch is used to handle runtime exceptions so that the program does not terminate abruptly when an error occurs.