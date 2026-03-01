package inter_to_advance;

import java.util.Scanner;

public class throw_throws {

    public void print(String name) throws IllegalArgumentException{
        if(name.contains("-")){
            throw new IllegalArgumentException("contains this - ");
        }
        System.out.println(name);
    }

    public static void main(String[] args) {
        throw_throws th = new throw_throws();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        th.print(name);
    }
}
