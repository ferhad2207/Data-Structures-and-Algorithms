package com.ferhad;

/**
 * @author Ferhad Mehdizade
 * Implementation of Doubly LinkedList
 * Insert O(n) (in case of inserting to beginning time complexity is O(1))
 * Delete O(n) (in case of deleting from beginning time complexity is O(1))
 * Access O(n)
 * Search O(n)
 * Good for insertion and deletion process as the Singly LinkedList. But the advantage of a doubly linked list (also
        called two – way linked list) is that given a node in the list, we can navigate in both directions.
 * But each node requires an extra pointer, requiring more space
 * Insertion or deletion of a node takes a bit longer
 */

public class DoublyLinkedList {
    private ListNode head;
    private int length;

    public DoublyLinkedList() {
        this.length = 0;
    }

    public ListNode getHead() {
        return head;
    }

    public void insertAtBegin(int data) {
        if (head == null) {
            head = new ListNode(data);
        } else {
            ListNode node = new ListNode(data);
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
        length++;
    }



    @Override
    public String toString() {
        String result = "[";
        ListNode temp = null;
        if (head != null) {
            result += head.getData();
            temp = head.getNext();
        }
        while (temp != null) {
            result += ", " + temp.getData();
            temp = temp.getNext();
        }
        return result + "]";
    }
}
