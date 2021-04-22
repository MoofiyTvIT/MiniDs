package com.moofiyTv.minids;

public interface StackContract<E> {

    void push(E e);

    E pop();

    E peek();

    boolean isEmpty();

}
