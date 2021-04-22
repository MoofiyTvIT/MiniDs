package com.moofiyTv.minids;

import java.util.Arrays;

public class Stack<E> implements StackContract<E> {
    int size = 0;
    E[] array = (E[]) new Object[10];

    @Override
    public void push(E e) {
        array[size++] = e; // arr[0] = e
        System.out.println(toString());
    }

    @Override
    public E pop() {
       if ( isEmpty())
           throw new IllegalStateException("ولك يا حمار الستاك فاضية اصلا ");
        E e = array[size - 1];
        array[--size] = null;
        return e;
    }

    @Override
    public E peek() {
        return array[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
