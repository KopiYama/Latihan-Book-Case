package com.kopiyama.model;

public  abstract class CommercialBook {
    private String bookCode;
    private String title;
    private Author author;
    private Publisher publisher;
    private double price;

    public CommercialBook() {

    }

    public CommercialBook(String bookCode, String title, Author author, Publisher publisher, double price) {
        this.bookCode = bookCode;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void calculatePrice();

    @Override
    public String toString() {
        return "CommercialBook:" + '\n' +
                "Book Code = " + bookCode + '\n' +
                "Title = " + title + '\n' +
                "Author = " + author + '\n' +
                "Publisher = " + publisher + '\n' +
                "Price = " + price + '\n';
    }
}
