package Homeworks.hw4;

import java.util.ArrayList;
import java.util.Arrays;

class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private static Pet pet;
    private Human father;
    private Human mother;
    String[][] schedule = new String[][]
            {{"Monday", "Do some homework"}
                    , {"Tuesday", "Go to gym"}
                    , {"Wednesday", "Talk with teacher"}
                    , {"Thursday", "Go to play football"}
                    , {"Friday", "Read a book"}
                    , {"Saturday", "Go to a birthday party"}
                    , {"Sunday", "Go out with friends"}};

    private static void describePet() {
        System.out.printf(
                "У меня есть %s, ему %s лет, он %s\n", pet.species, pet.age, getTrickLevel());
    }

    private static void greetPet() {
        System.out.printf("Привет, %s\n", pet.getNickname());
    }

    private static String getTrickLevel() {
        return pet.trickLevel > 50 ? "Очень хитрый" : "Не совсем хитрый";
    }

    @Override
    public String toString() {
        if (name == null) {
            return "Error";
        } else if (mother == null) {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    "}"
                    ;
        } else if (pet == null) {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", mother=" + mother.name +
                    ", father=" + father.name +
                    "}"
                    ;
        } else {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iq +
                    ", mother=" + mother.name +
                    ", father=" + father.name +
                    ", pet=" + pet + "}";
        }
    }


    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    Human(String name, String surname, int year, Human mother, Human father, int iq, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    Human() {

    }
}
