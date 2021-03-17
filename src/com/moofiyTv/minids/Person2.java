package com.moofiyTv.minids;

// انا بس باخد مصاري كاملة int
public class Person2 implements Ninja {
    @Override
    public void name(String name) {
        System.out.println("My Name is ما الكش دخل");
    }

    @Override
    public void attack(String attackType) {
        System.out.println("ما حد يدخل فيي انا بهاجم مين ما بدي");
    }

    @Override
    public String masterName() {
        return "الزنخ";
    }

}
