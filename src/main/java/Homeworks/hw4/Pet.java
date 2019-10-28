package Homeworks.hw4;

import java.util.ArrayList;
import java.util.Arrays;

public class Pet {

    String species;
    static int age;
    int trickLevel;
    static ArrayList<String> habits = new ArrayList<>();

    public String getSpecies() {
        return species;
    }

    public static int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public static ArrayList<String> getHabits() {
        return habits;
    }

    String nickname;
    String getNickname() {
        return nickname;
    }
    public void respond() {
        System.out.printf("Привет, хозяин. Я - %s. Я соскучился!", nickname);
    }
    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }
    void eat() {
        System.out.println("Я кушаю!");
    }

    Pet() {
    }

    public Pet(String species, String nickname, int age, int trickLevel, ArrayList<String> habits) {
        this.species = species;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        this.nickname = nickname;
    }

    Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        if (age == 0) {
            return "Pet{" +
                    "species='" + species + '\'' +
                    ", nickname='" + nickname + '\'' +
                    '}';
        }else {
            return "Pet{" +
                    "species='" + species + '\'' +
                    ", age=" + age +
                    ", trickLevel=" + trickLevel +
                    ", habits=" + habits +
                    ", nickname='" + nickname + '\'' +
                    '}';
        }

    }
}