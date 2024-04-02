package com.kopiyama.model;

public class Comic extends CommercialBook{
    private Mangaka author;
    private Boolean volumeSeries;
    private Double tax;

    public Comic() {
    }

    public Comic(String bookCode, String title, Mangaka author, Publisher publisher, Double price, boolean volumeSeries) {
        super(bookCode, title, publisher, price);
        this.author = author;
        this.volumeSeries = volumeSeries;
        this.tax = tax;
        calculatePrice();
        calculateTax();
    }

    @Override
    public void calculatePrice() {
        double multiplier = getPublisher().getProductionCost();
        if (author.getRating().equalsIgnoreCase("New Commer")) {
            multiplier = volumeSeries ? 1.35 : 1.25;
        } else if (author.getRating().equalsIgnoreCase("Good")) {
            multiplier = volumeSeries ? 1.45 : 1.30;
        } else if (author.getRating().equalsIgnoreCase("Best Seller")) {
            multiplier = volumeSeries ? 1.50 : 1.40;
        }
        this.price = publisher.getProductionCost() * multiplier;
    }

    public void calculateTax() {
        this.tax = this.price * 0.05;
    }

    @Override
    public Mangaka getAuthor() {
        return this.author;
    }

    public void setAuthor(Mangaka author) {
        this.author = author;
    }

    public Boolean getVolumeSeries() {
        return volumeSeries;
    }

    public void setVolumeSeries(Boolean volumeSeries) {
        this.volumeSeries = volumeSeries;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Comic : " +
                "Book Code = " + super.bookCode +
                ", Title = " + super.title +
                ", Author = " + author.getFullName() +
                ", Publisher = " + super.publisher.getPublisherName() + '\'' +
                ", Price = " + super.price + '\'' +
                ", Volume Series = " + volumeSeries + '\'' +
                ", Tax = " + tax;
    }
}
