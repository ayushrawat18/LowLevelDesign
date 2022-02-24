package com.algorithm;

public class DoublyLinkedList {

    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = new DoublyLinkedListNode(null);
        this.tail = new DoublyLinkedListNode(null);

        head.next = tail;
        tail.prev = head;
    }

    public void removeNode(DoublyLinkedListNode node) {
        if (node != null) {
            if (node == head) {
                node = node.next;
                head = node;
            } else if (node == tail) {
                DoublyLinkedListNode prev = node.prev;
                prev.next = null;
                tail = prev;
            } else {
                DoublyLinkedListNode prev = node.prev;
                DoublyLinkedListNode next = node.next;
                prev.next = next;
                next.prev = prev;
            }
        }
    }

    public void addNode(DoublyLinkedListNode node) {
        tail.next = node;
        node.prev = tail;
        tail = node;
    }
}
