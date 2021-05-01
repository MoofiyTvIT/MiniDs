package com.moofiyTv.minids;

public interface QueueContract<E> {

    void enqueue(E e);


    E dequeue();


    E peek();


    boolean isEmpty();


}
