package ru.mirea.list1;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    private int listLen;

    public CircularLinkedList() {
        head = null;
        tail = null;
        listLen = 0;
    }

    public int getLength() {
        return listLen;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public void push(int number) {
        Node newNode = new Node();
        newNode.number = number;
        if(this.isEmpty()) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
        listLen++;
    }

    public void printLinkedList() {
        Node posit = head;
        do {
            posit.DisplayNodeData();
            posit = posit.next;
        }while (posit != head);
    }

    class Node {
        int number;
        public Node next;
        public Node prev;


        public void DisplayNodeData() {
            System.out.print(number +  " {");
            if (next != null) {
                System.out.print("next-"+ next.number + "/");
            }
            else{
                System.out.print("next-null/");
            }
            if (prev != null) {
                System.out.print("prev-"+ prev.number + "}\n" );
            }
            else{
                System.out.print("prev-null} \n");
            }
        }

    }
}








