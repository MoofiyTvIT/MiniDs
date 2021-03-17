package com.moofiyTv.minids;

public interface List<E> {
    /**
     * Add elements to the list
     *
     * @param e the Element
     */
    void add(E e);

    /**
     * Remove element By index
     *
     * @param index
     * @return the removed Element
     */
    E remove(int index);

    /**
     * get Element by Index
     *
     * @param index
     * @return the Element
     */
    E get(int index);

    /**
     * Method to check the state of the list
     *
     * @return true if Empty false otherwise
     */
    boolean isEmpty();

    /**
     * method to know the size of the list
     *
     * @return the size of this list
     */
    int size();
}
