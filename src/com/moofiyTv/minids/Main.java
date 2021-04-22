package com.moofiyTv.minids;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println(linkedList);
        linkedList.add(1);// head
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(8);// tail

        System.out.println(linkedList.search(2));
        System.out.println(linkedList.search(1));
        System.out.println(linkedList.search(8));
        System.out.println(linkedList.search(17));

        linkedList.removeHead();
        linkedList.removeTail();

    }
}
