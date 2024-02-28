package org.example.Task5;

public class User {

    private String name;
    private String surname;
    private Integer age;
    private Male male;

    public User(String name, String surname, Integer age, Male male) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Male getMale() {
        return male;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMale(Male male) {
        this.male = male;
    }
}
