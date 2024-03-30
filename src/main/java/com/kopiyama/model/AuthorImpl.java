package com.kopiyama.model;

public class AuthorImpl implements Author {
    private String firstName;
    private String lastName;
    private String country;
    private int age;

    public AuthorImpl() {
    }

    public AuthorImpl(String firstName, String lastName, String country, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }

    @Override
    public String getFullname() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author:" + '\n' +
                "Name    = " + getFullname() + '\n' +
                "Country = " + country + '\n' +
                "Age     = " + age + '\n';
    }
}
