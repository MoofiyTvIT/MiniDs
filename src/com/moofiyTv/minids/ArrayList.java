package com.moofiyTv.minids;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList<E> implements List<E> {

    // الحجم المبدأي
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] arrayObjects;
    // حجمها
    private int size;
    //سعتها
    private int capacity;


    public ArrayList(int capacity) {
        this.capacity = capacity;
        arrayObjects = new Object[capacity];
    }

    public ArrayList() {
        capacity = DEFAULT_CAPACITY;
        arrayObjects = new Object[capacity];
    }

    @Override
    public void add(E e) {
        System.out.println("عم بضيف على الآراي " + e);
        if (size == capacity)
            grow();
        arrayObjects[size] = e;
        size++;
        System.out.println(toString());
    }

    private void grow() {
        System.out.println("زيادة الآراي يا حلو");
        // newCapacity = oldCapacity + oldCapacity * 2
        capacity = capacity + capacity << 1;
        // بتزيد حجم الآراي تاعتنا
        arrayObjects = Arrays.copyOf(arrayObjects, capacity);
    }

    @Override
    // remove (2)
    // O(n)
    public E remove(int index) {
        if (index > size)
            throw new IllegalStateException("Index Bigger than Size are you crazy? انتبه على حالك");
        E element = (E) arrayObjects[index];
        System.out.println("removing " + element);
        if (index == size - 1) {
            arrayObjects[index] = null;
        }
        // arr[2] = arr[3]
        // arr[3] = arr[2]
        while (index < size - 1) {
            arrayObjects[index] = arrayObjects[index + 1];
            arrayObjects[index + 1] = null;
            index++;
        }
        size--;
        System.out.println(toString());
        return element;
    }

    @Override
    // O(1)
    public E get(int index) {
        return (E) arrayObjects[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "size=" + size +
                " capacity=" + capacity +
                " arrayObjects=" + Arrays.toString(arrayObjects) +
                '}';
    }
}
