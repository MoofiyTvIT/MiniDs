package com.moofiyTv.minids;

//عقد
public interface Ninja<T> {

    //البنود
    void name(String name);
    void attack(String attackType);
    String masterName();
    void giveRewards(T m);
}
