package com.kopiyama.model;

public class EBook extends CommercialBook{
    private Author author;

    @Override
    public void calculatePrice() {
        price = publisher.getProductionCost() * 1.2;
    }

    public EBook() {
    }

    public EBook(String bookCode, String title, Author author, Publisher publisher, Double price) {
        super(bookCode, title, publisher, price);
        this.author = author;
        calculatePrice();
    }

    @Override
    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return //"EBookk : " +
                "Book Code = " + super.bookCode +
                ", Title = " + super.title +
//                ", Author = " + getAuthor().getFullName() +
                ", Publisher = " + super.publisher.getPublisherName() +
                ", Price = " + super.price;
    }
}
