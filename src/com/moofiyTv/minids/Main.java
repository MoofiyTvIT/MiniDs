package com.moofiyTv.minids;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person1 person1 = new Person1();
        person1.name("احمد");
        person1.attack("شوريكن");

        Person2 person2 = new Person2();
        person2.name("علي");
        person2.attack("سيوف");

        printPerson(person1);
        printPerson(person2);

    }

    public static void printPerson(Ninja ninja) {
        System.out.println("اسم استاذي هو " + ninja.masterName());
    }

}
