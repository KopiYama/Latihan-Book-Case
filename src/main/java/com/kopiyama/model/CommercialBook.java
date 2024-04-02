package com.kopiyama.model;

public abstract class CommercialBook {
    protected String bookCode;
    protected String title;
    protected Publisher publisher;
    protected Double price;

    public CommercialBook() {
    }

    public CommercialBook(String bookCode, String title, Publisher publisher, Double price) {
        this.bookCode = bookCode;
        this.title = title;
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

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract Author getAuthor();

    public abstract void calculatePrice();

    @Override
    public String toString() {
        return "Book : " +
                "Book Code = " + bookCode + '\'' +
                ", Title = " + title + '\'' +
                ", Publisher=" + publisher + '\'' +
                ", Price=" + price;
    }
}
