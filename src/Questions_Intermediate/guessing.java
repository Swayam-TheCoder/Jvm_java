package Questions_Intermediate;

import java.util.Scanner;

public class guessing {
    int random;

    guessing(){
        random = (int) Math.ceil(Math.random() * 100);
    }

    int guess(int guessnumber){
        return guessnumber - random;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        guessing gue = new guessing();
        System.out.println(gue.random);
        int guess;
        int result;

        do{
            guess = sc.nextInt();
            result = gue.guess(guess);
            if(result == guess){
                System.out.println("Congrats");
            } else if(result < 0){
                System.out.println("Guess higher");
            } else{
                System.out.println("guess lower");
            }
        } while(result != 0);
    }
}

