package com.interfaces;

public interface Cache<K, V> {

 public void add(K key, V value);

 public void remove(K key);

 public void get(K key);

}
