package com.service;

import com.interfaces.Cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K, V> implements Cache<K, V> {

    int capacity;
    Map<K, V> dll;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        dll = new HashMap<>();
    }

    @Override
    public void add(K key, V value) {
       if (isStorageFull()) {

       }
    }


    @Override
    public void remove(Object key) {

    }

    @Override
    public void get(Object key) {

    }

    private boolean isStorageFull() {
        return capacity == dll.size();
    }

}
