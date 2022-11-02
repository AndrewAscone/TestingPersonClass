package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;

    private int height = Integer.MAX_VALUE;

    private int weight = Integer.MAX_VALUE;

    private String eyeColor = "";

    private String hairColor = "";

    private String gender= "";



    public Person() {
    }

    public Person(int age) {
        setAge(age);
    }

    public Person(String name) {
        setName(name);
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Person(int height, int weight, String eyeColor, String hairColor, String gender){
        setHeight(height);
        setWeight(weight);
        setEyeColor(eyeColor);
        setHairColor(hairColor);
        setGender(gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
       this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
