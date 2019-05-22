package d1.Constructor;

public class Person {

    private String name = "John";
    private String surname = "Doe";
    private int age = 27;
    private char gender = 'm';

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String surname, int age, char gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
}
