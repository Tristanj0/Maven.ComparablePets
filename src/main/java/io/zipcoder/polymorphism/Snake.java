package io.zipcoder.polymorphism;


public class Snake extends Pet implements Comparable<Pet> {
    public Snake(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Snake{" +
                "name='" + name + '\'' +
                '}';
    }

    public void speak() {
        System.out.println("Hisss!");
    }
}
