package com.moofiyTv.minids;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(100);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        System.out.println(queue.peek());
    }
}
