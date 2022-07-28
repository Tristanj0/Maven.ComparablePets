package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        ArrayList<Pet> pets = new ArrayList<Pet>();

        Scanner numOfPets = new Scanner(System.in);
        System.out.println("How many pets do you have");
        int petNum = numOfPets.nextInt();

        for(int i = 0; i < petNum; i++) {

            Scanner typeOfPet = new Scanner(System.in);
            System.out.println("Type of pet");
            String petType = typeOfPet.next();

            Scanner nameOfPet = new Scanner(System.in);
            System.out.println("Pet Names? ");
            String petName = nameOfPet.nextLine();

            if (petType.equalsIgnoreCase("dog")) {
                System.out.println("Dog created");
                Dog dog = new Dog(petName);
                pets.add(dog);
            }

            if (petType.equalsIgnoreCase("cat")) {
                System.out.println("Cat created");
                Cat cat = new Cat(petName);
                pets.add(cat);
            }

            if (petType.equalsIgnoreCase("snake")) {
                System.out.println("Snake created");
                Snake snake = new Snake(petName);
                pets.add(snake);
            }
        }
        System.out.println(pets.size() + " Pet(s): " + pets);
        for (Pet pet : pet) {
            System.out.println(pet.name + " says: ");
            pet.speak();
        }

        Collections.sort(pets);
        System.out.println("Sorted by Pet Name: " + pets);

        Collections.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
            }
        });
        System.out.println("Sorted by Pet Type: " + pets);
    }


}
