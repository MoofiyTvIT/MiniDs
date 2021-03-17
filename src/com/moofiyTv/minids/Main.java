package com.moofiyTv.minids;

public class Main {

    public static void main(String[] args) {
        // مقايضات
        Person1 person1 = new Person1();
        person1.name("احمد");
        // مصاري
        Person2 person2 = new Person2();
        person2.name("علي");

        person1.giveRewards("كرسي");
        person2.giveRewards(5);

    }
}
