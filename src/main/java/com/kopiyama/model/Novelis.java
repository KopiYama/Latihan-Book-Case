package com.kopiyama.model;

public class Novelis extends AuthorImpl {
    private boolean serial;
    private String rating;

    public Novelis(){

    }

    public Novelis(String firstName, String lastName, String country, int age, boolean serial, String rating) {
        super(firstName, lastName, country, age);
        this.serial = serial;
        this.rating = rating;
    }

    public boolean isSerial() {
        return serial;
    }

    public void setSerial(boolean serial) {
        this.serial = serial;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Novelis:" + '\n' +
                "Name    = " + getFullname() + '\n' +
                "Country = " + getCountry() + '\n' +
                "Age     = " + getAge() + '\n' +
                "Serial  = " + serial + '\n' +
                "Rating  = " + rating + '\n';
    }
}
