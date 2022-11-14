package ru.mirea.list2;

public class ListSortTester {
    public static void main(String[] args){
        DoublyLinkedList lst = new DoublyLinkedList();
        lst.add(6);
        lst.add(3);
        lst.add(91);
        lst.add(6);
        lst.add(10);
        lst.add(11);
        lst.add(4);
        lst.add(51);
        lst.add(100);

        lst.printLinkedList();
        System.out.println("");
        System.out.println("Sorted...");
        System.out.println("");
        lst.sort_list();
        lst.printLinkedList();

    }

}

