package d1.Methods;

public class Person {

    private String name = "John";
    private String surname = "Doe";
    private int age = 27;
    private char gender = 'm';

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void fullName(){
        System.out.println(this.name + " "+ this.surname);
    }
    public void increaseAge(){
        this.age = age+1;
    }

}

