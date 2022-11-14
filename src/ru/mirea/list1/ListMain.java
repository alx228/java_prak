package ru.mirea.list1;

public class ListMain {
    public static void main(String[] args){
        CircularLinkedList lst = new CircularLinkedList();
        lst.push(5);
        lst.push(18);

        lst.printLinkedList();
        System.out.println("");

        System.out.println("");
        lst.push(19);
        lst.printLinkedList();

        System.out.println("");
        lst.push(23);
        lst.printLinkedList();
    }

}
