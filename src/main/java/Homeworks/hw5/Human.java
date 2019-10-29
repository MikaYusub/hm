package Homeworks.hw5;

import java.util.Arrays;
import java.util.Objects;

class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;

    public Family getFamily() {
        return family;
    }

    void setFamily(Family family) {
        this.family = family;
    }

    private String[][] schedule = new String[][]
            {{"Monday", "Do some homework"}
                    , {"Tuesday", "Go to gym"}
                    , {"Wednesday", "Talk with teacher"}
                    , {"Thursday", "Go to play football"}
                    , {"Friday", "Read a book"}
                    , {"Saturday", "Go to a birthday party"}
                    , {"Sunday", "Go out with friends"}};

    private void describePet() {
        System.out.printf(
                "У меня есть %s, ему %s лет, он %s\n"
                , this.family.getPet().getSpecies()
                , this.family.getPet().getAge()
                , this.family.getPet().getTrickLevel());
    }

    private void greetPet() {
        System.out.printf("Привет, %s\n", this.family.getPet().getNickname());
    }

    private String getTrickLevel() {
        return this.family.getPet().getTrickLevel() > 50 ? "Очень хитрый" : "Не совсем хитрый";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return year == human.year &&
                name.equals(human.name) &&
                surname.equals(human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year);
    }

    @Override
    public String toString() {
        if (name == null) {
            return "Error";
        } else if (iq == 0) {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    "}"
                    ;
        } else if (schedule == null) {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year + '\'' +
                    ", iq=" + iq + '\'' +
                    "}"
                    ;
        } else {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year + '\'' +
                    ", iq=" + iq + '\'' +
                    ", schedule=" + Arrays.deepToString(schedule) + '\'' +
                    "}";
        }
    }


    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    Human() {

    }
}
