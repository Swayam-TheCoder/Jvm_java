package Questions_Intermediate.OOPS.Encapsulation.com.example.utils;

import Questions_Intermediate.OOPS.Encapsulation.com.example.geometry.Circle;
import Questions_Intermediate.OOPS.Encapsulation.com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(1);
        Rectangle rect = new Rectangle(4,7);

        System.out.println(cir.toString());
        System.out.println(rect.toString());
    }
}
