package com.ferhad;

public class Main {

    public static void main(String[] args) {
        // Testing DoublyLinkedList class...

        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(3);
        list.insertAtEnd(1);
        // [5, 3, 1]
        list.insertAtBegin(11);
        // [11, 5, 3, 1]
        list.insert(33, 2);
        // [11, 5, 33, 3, 1]
        list.removeAtBegin();
        // [5, 33, 3, 1]
        list.removeFromEnd();
        // [5, 33, 3]
        list.remove(1);
        // [5, 33]
        list.length(); //  2
        list.get(1); // 33
        list.getPosition(33); // 1
        list.getHead(); // 5
        list.clearList();
        // []

        System.out.println(list);
        // []
    }
}