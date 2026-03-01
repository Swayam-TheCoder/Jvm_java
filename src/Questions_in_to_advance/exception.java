package Questions_in_to_advance;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1 ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2 ");
        int num2 = sc.nextInt();

        try{
            int result = num1/num2;
        }catch (ArithmeticException e){
            if(e.getMessage().equals("/ by zero")){
                System.out.println("hehe");
            } else{
                throw e;
            }
        }

    }
}
