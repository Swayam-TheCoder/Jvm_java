package inter_to_advance.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Interface {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.offer(9);
        System.out.println(queue.peek());
        System.out.println(queue.element());
//        System.out.println(queue.remove());
        System.out.println(queue.poll());
        utility.print(queue);
        queue.remove();
        utility.print(queue);
//        queue.remove(); // throws an exception
        System.out.print(queue.poll());
    }
}
