package com.moofiyTv.minids;

public interface LinkedListContract<E> {

    void add(E element);

    void removeHead();

    void removeTail();

    boolean search(E element);

}
