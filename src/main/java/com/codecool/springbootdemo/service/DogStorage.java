package com.codecool.springbootdemo.service;

import com.codecool.springbootdemo.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/*
    @Service and @Component do basically the same thing on our level:
    It lets us create @Bean definitions
 */
@Service
public class DogStorage {

    private List<Dog> dogs = new LinkedList<>();

    private DogCreator dogCreator;

    @Autowired
    public DogStorage(DogCreator dogCreator) {
        this.dogCreator = dogCreator;
    }

    public Dog addRandomDog(){
        Dog dog = dogCreator.createRandomDog();
        this.dogs.add(dog);
        return dog;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public Dog addDog(Dog dog){
        this.dogs.add(dog);
        return dog;
    }

    public Dog update(String name, Dog dog) throws Exception {
        Dog foundDog = this.dogs.stream()
                .filter(dog1 -> dog1.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new Exception("Dog not found: " + name));

        foundDog.setAge(dog.getAge());
        foundDog.setBreed(dog.getBreed());

        return foundDog;
    }
}
