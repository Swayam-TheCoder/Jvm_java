package Question_OOPs.encap.utils;

import Question_OOPs.encap.geometry.Circle;
import Question_OOPs.encap.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();
        int red = 2, len = 4, bre = 5;
        System.out.println(cir.Circle(red));
        System.out.println(rect.rectangle(len, bre));
    }
}
