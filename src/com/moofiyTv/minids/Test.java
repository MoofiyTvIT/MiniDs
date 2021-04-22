package com.moofiyTv.minids;

import java.util.Arrays;

public class Test<E>   {

    int size = 0;
    E[] array = (E[]) new Object[100];

    
    public void push(E e) {
        array[size++] = e;
        System.out.println(toString());
    }

    
    public E pop() {
        E e = array[size - 1];
        array[--size] = null;
        return e;
    }

    
    public E peek() {
        return array[size - 1];
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

    
    public String toString() {
        return "Stack{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
