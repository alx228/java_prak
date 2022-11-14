package ru.mirea.list2;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int listLen;
    public DoublyLinkedList() {
        listLen = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void add(int number){
        Node newNode = new Node();
        newNode.number = number;

        if (this.isEmpty()) {
            head = tail = newNode;
            return;
        }
        head.prev = newNode;

        newNode.next = head;
        head = newNode;
        listLen++;
    }
    public void add(int number, int index){

        Node newNode = new Node();
        newNode.number = number;
        Node posit = head;
        if (index == 0){
            add(number);
            return;
        }
        for (int i=1; i<index && posit.next != null; i++){
            posit = posit.next;
        }
        newNode.next = posit.next;
        newNode.next.prev = newNode;
        newNode.prev = posit;
        posit.next = newNode;
        listLen++;
    }

    public void DeleteNode(int index){
        Node posit = head;
        if(index == 0){
            head = head.next;
            head.prev = null;
        }

        for(int i=1; i<index;i++){
            if (posit.next == null){
                return;
            }
            posit = posit.next;
        }
        if (posit.next.next != null){
            posit.next.next.prev = posit;
            posit.next = posit.next.next;
        }
        else{
            posit.next = null;
        }
        listLen--;
    }

    public void printLinkedList() {
        Node posit = head;
        while (posit != null) {
            posit.DisplayNodeData();
            posit = posit.next;
        }
        System.out.print("NULL\n");
    }

    public void sort_list(){
        Node start = head;
        int pos = 0;
        while (start.next != null){
            Node posit = start.next;
            Node minNode = posit;
            while(posit != null){
                if (posit.number <= minNode.number){
                    minNode = posit;
                }
                posit = posit.next;
            }
            if (minNode.next == null){
                minNode.prev.next = null;
            }
            else if(minNode.prev != null){
                minNode.next.prev = minNode.prev;
                minNode.prev.next = minNode.next;
            }

            add(minNode.number, pos);
            pos++;
        }
    }
}

class Node{
    int number;
    Node next;
    Node prev;

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
