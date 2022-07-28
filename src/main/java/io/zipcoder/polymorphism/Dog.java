package io.zipcoder.polymorphism;

public class Dog extends Pet implements Comparable<Pet> {
    public Dog(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
