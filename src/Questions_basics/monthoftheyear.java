package Questions_basics;

import java.util.Scanner;

public class monthoftheyear {
    public static void main(String[] args) {
        monthoftheyear monthh = new monthoftheyear();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = sc.nextInt();
        String find = monthh.mon(month);
        System.out.println(find);
    }

    public String mon(int month){
        String name = switch (month){
            case 1 -> "Jan";
            case 2 -> "feb";
            case 3 -> "march";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "june";
            case 7 -> "july";
            case 8 -> "aug";
            case 9 -> "sept";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "invalid";
        };
        return name;
    }

}
