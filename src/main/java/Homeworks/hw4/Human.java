package Homeworks.hw4;

import java.util.Arrays;

public class Human {
    public String name = "Mikayil";
    public String surname = "Yusubov";
    int year = 1999;
    int iq = 90;
    public static Pet pet = new Pet();
    private Human father = new Human();
    private Human mother = new Human();
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


    public static String getTrickLevel() {
        String TrickLevel;
        TrickLevel = pet.trickLevel > 50 ? "Очень хитрый" : "Не совсем хитрый";
        return TrickLevel;
    }

    //    @Override
//    public String toString() {
//        if (name == null) {
//            return "Error";
//        }else if (mother == null) {
//            return "Human{" +
//                    "name='" + name + '\'' +
//                    ", surname='" + surname + '\'' +
//                    ", year=" + year +
//                    "}"
//                    ;
//        } else {
//            return "Human{" +
//                    "name='" + name + '\'' +
//                    ", surname='" + surname + '\'' +
//                    ", year=" + year +
//                    ", iq=" + iq +
//                    ", mother=" + mother +
//                    ", father=" + father +
//                    ", pet=" + pet.species +
//                    "{nickname=" + pet.nickname +
//                    ", age=" + pet.age +
//                    ", trickLevel=" + pet.trickLevel +
//                    ", habits=" + general.Tasks_in_class.Arrays.toString(pet.habits) +
//                    "}}";
//        }
//    }


    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father, String[][] schedule, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human() {

    }
}
