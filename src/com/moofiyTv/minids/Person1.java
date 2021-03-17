package com.moofiyTv.minids;

// انا بس باخد مقايضات String
public class Person1 implements Ninja {

    @Override
    public void name(String name) {
        System.out.println("My Name is " + name);
    }

    @Override
    public void attack(String attackType) {
        System.out.println("My Attack Type is " + attackType);
    }

    @Override
    public String masterName() {
        return "المحترم";
    }

}
