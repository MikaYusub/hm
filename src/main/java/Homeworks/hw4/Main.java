package Homeworks.hw4;

public class Main {

    public static void main(String[] args) {
        Human motherLennon = new Human("Julia", "Lennon", 1914);
        Human fatherLennon = new Human("Alfred", "Lennon", 1912);
        Human Lennon = new Human("John", "Lennon", 1940, motherLennon, fatherLennon);
        Human motherPresley = new Human("Priscilla", "Presley", 1945);
        Human fatherPresley = new Human("Elvis", "Presley", 1935);
        Human Presley = new Human("Lisa Marie", "Presley", 1968, motherPresley, fatherPresley);
        Pet pet1 = new Pet("Cat","Kisa");
        pet1.eat();

    }
}
