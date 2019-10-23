package Homeworks.hw4;

import java.util.ArrayList;
import java.util.Arrays;

public class Pet {

    public String species = "Собака";
    public int age;
    public int trickLevel ;
    public ArrayList<String> habits = new ArrayList<>();
    public String nickname;

    public String getNickname() {
        return nickname;
    }

    public void respond() {
        System.out.printf("Привет, хозяин. Я - %s. Я соскучился!", nickname);
    }

    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }

    public void eat() {
        System.out.println("Я кушаю!");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public Pet() {

    }

    public Pet(String species, String nickname, int age, int trickLevel, ArrayList<String> habits) {
        this.species = species;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }
}