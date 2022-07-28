package io.zipcoder.polymorphism;

public class Cat extends Pet implements Comparable<Pet> {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public void speak() {
        System.out.println("Hiss!");
    }
}
