package com.codecool.springbootdemo.model;

import javax.validation.constraints.NotEmpty;

public class Dog {

    private Breed breed;
    @NotEmpty
    private String name;
    private Integer age;

    public Dog(Breed breed, String name, Integer age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed=" + breed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
