package com.service;

import com.algorithm.DoublyLinkedList;
import com.algorithm.DoublyLinkedListNode;
import com.interfaces.Cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache implements Cache {

    int capacity;
    Map<Integer, DoublyLinkedListNode> dll;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        dll = new HashMap<>();
        impl = new DoublyLinkedList();
    }


    @Override
    public void add(Integer key, Integer value) {
        if (dll.containsKey(key)) {
            DoublyLinkedListNode node = dll.get(key);


        }

            if (isStorageFull()) {

        }
    }

    @Override
    public void remove(Integer key) {

    }

    @Override
    public void get(Integer key) {

    }


    private boolean isStorageFull() {
        return capacity == dll.size();
    }


}
