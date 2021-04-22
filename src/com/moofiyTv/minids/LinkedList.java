package com.moofiyTv.minids;

public class LinkedList<E> implements LinkedListContract<E> {

    Node head = null;

    private class Node {
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
    public void add(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(element);
        }
        System.out.println(toString());
    }

    @Override
    public void removeHead() {
        if (head == null) {
            throw new IllegalStateException("LinkedList is empty, you idiot,يا حمار");
        }
        head = head.next;
        System.out.println(toString());
    }

    @Override
    public void removeTail() {
        if (head == null) {
            throw new IllegalStateException("LinkedList is empty, you idiot,يا حمار");
        }
        Node temp = head;
        if (temp.next == null) {
            head = null;
            System.out.println(toString());
            return;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println(toString());
    }

    @Override
    public boolean search(E element) {
        if (head == null) {
            throw new IllegalStateException("LinkedList is empty, you idiot,يا حمار");
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == element) return true;
            temp = temp.next;
        }

        return temp.data == element;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
