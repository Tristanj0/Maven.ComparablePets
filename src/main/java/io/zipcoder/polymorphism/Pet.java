package io.zipcoder.polymorphism;

public class Pet implements Comparable<Pet> {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Pet(String name){
        this.name = name;
    }

    public void speak(){
        System.out.println("Pet speaks");
    }


    @Override
    public int compareTo(Pet pet) {
        return (this.getName().compareTo(pet.getName()));
    }
}
