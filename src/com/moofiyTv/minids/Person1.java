package com.moofiyTv.minids;

// انا بس باخد مقايضات String
public class Person1 implements Ninja<String> {

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

    @Override
    public void giveRewards(String m) {
        System.out.println(" قايضت معاك "+m);


    }


}
