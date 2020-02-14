package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String height;
    private String weight;
    private String eyeColor;
    private String gender;
    private Double shoeSize;
    

    public Person() {

        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person (int age) {

        this.age = age;
    }

    public Person(String name) {

        this.name = name;
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }
    
    public Person(String height, String weight, String eyeColor, String gender, Double shoeSize) {
    
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.gender = gender;
        this.shoeSize = shoeSize;
    }


    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age){

        this.age = age;
    }

    public void setHeight(String height) {

        this.height = height;
    }

    public void setWeight(String weight) {

        this.weight = weight;
    }

    public void setEyeColor(String eyeColor) {

        this.eyeColor = eyeColor;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setShoeSize(Double shoeSize) {

        this.shoeSize = shoeSize;
    }


    public String getName() {

        return this.name;
    }

    public Integer getAge() {

        return this.age;
    }

    public String getHeight() {

        return this.height;
    }

    public String getWeight() {

        return this.weight;
    }

    public String getEyeColor() {

        return this.eyeColor;
    }

    public String getGender() {

        return this.gender;
    }

    public Double getShoeSize() {

        return this.shoeSize;
    }
}


