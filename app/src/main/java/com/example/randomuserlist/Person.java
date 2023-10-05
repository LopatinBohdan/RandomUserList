package com.example.randomuserlist;

public class Person {
    private int avatar;
    private String name;
    private String surname;
    private int age;
    private Country country;

    public Person(int avatar, String name, String surname, int age, Country country) {
        this.avatar = avatar;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.country = country;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
