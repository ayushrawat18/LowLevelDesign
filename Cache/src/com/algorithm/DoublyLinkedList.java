package com.algorithm;

public class DoublyLinkedList {

    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = new DoublyLinkedListNode(null);
        this.tail = new DoublyLinkedListNode(null);

        head.right = tail;
        tail.left = head;
    }

    public void removeNodeFromStart() {
        if (head != null)
            
    }

}
