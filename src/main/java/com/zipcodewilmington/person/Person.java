package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;

    public Person() {
    }

    public Person(int age) {
    }

    public Person(String name) {
    }

    public Person(String name, int age) {
    }

    public void setName(String name) {
        //String newName = name;
        getName();
    }

    public void setAge(int age) {
       //int newAge = age;
        getAge();
    }

    public String getName() {
        name = "Leon";
        return name;
    }

    public Integer getAge() {
        age = 5;
        return age;
    }
}
