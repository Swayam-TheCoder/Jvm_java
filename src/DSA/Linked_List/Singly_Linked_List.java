package DSA.Linked_List;

import java.util.LinkedList;

public class Singly_Linked_List {

    private Node tail;
    private Node head;
    private int size;

    public Singly_Linked_List(){
        this.size = 0;
    }

    // insert from first
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    // insert from any index
    public void insert(int value, int index){
        if(index == 0){
            insertfirst(value);
            return;
        }
        if(index == size){
            insertlast(value);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // insert from last
    public void insertlast(int val){
        if(tail == null){
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // delete from first
    public int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    // delete from last or any index
    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public int delete(int index){
        if(index == 0){
            return deletefirst();
        }
        if(index == size-1){
            return deletelast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;

    }

    public int deletelast(){
        if(size <= 1){
            return deletefirst();
        }
        Node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }


    // display the linked list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    // defining the Node class
    private class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    //main
    public static void main(String[] args) {
        Singly_Linked_List ll = new Singly_Linked_List();
        ll.insertfirst(10);
        ll.insertfirst(20);
        ll.insertfirst(30);
        ll.insertfirst(40);
        ll.insertlast(45);
        ll.insert(100,3);
        ll.deletefirst();
        ll.deletelast();
        ll.insert(200, 2);
        ll.display();

    }
}
