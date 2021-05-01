package com.moofiyTv.minids;

public class Queue<E> implements QueueContract<E> {

    Node front;
    Node rare;

    class Node {
        Node next;
        E data;

        public Node(E data) {
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }

    @Override
    public void enqueue(E e) {
        Node newNode = new Node(e);
        if (front == null) {
            rare = front = newNode;
            System.out.println(toString());
            return;
        }
        rare.next = newNode;
        rare = newNode;

        System.out.println(toString());

    }

    @Override
    public E dequeue() {
        if (front == null)
            throw new IllegalStateException("انت قاعد بتخش في طابور فاضي يا حمار ");
        Node temp = front;
        front = front.next;
        return temp.data;
    }

    @Override
    public E peek() {
        return front.data;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", rare=" + rare +
                '}';
    }
}
