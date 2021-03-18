package com.moofiyTv.minids;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Integer> arrayList = new ArrayList<>(6);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        System.out.println("get by index " + arrayList.get(0));
        System.out.println("Removing by index " + arrayList.remove(1));
        System.out.println("is Empty " + arrayList.isEmpty());
        System.out.println("Size" + arrayList.size());


    }
}
