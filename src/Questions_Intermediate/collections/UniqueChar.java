package Questions_Intermediate.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set <Character> uniquechar = new HashSet<>();
        System.out.println("Enter String: ");
        String input = sc.next();

        for(char ch: input.toCharArray()){
            uniquechar.add(ch);
        }
        System.out.println("Size of the Unique characters are: "+uniquechar.size());
    }
}
