package com.kopiyama.model;

public class Novel extends CommercialBook {
    private Novelis author;
    private String genre;

    public Novel() {
    }

    public Novel(String bookCode, String title, Novelis author, Publisher publisher, Double price,String genre) {
        super(bookCode, title, publisher, price);
        this.author = author;
        this.genre = genre;
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        switch (author.getRating().toLowerCase()) {
            case "new commer":
                this.price = publisher.getProductionCost() * 1.25;
                break;
            case "good":
                this.price = publisher.getProductionCost() * 1.35;
                break;
            case "best seller":
                this.price = publisher.getProductionCost() * 1.50;
                break;
            default:
                // TODO Create Exception to throw error
                break;
        }


    }

    @Override
    public Novelis getAuthor() {
        return this.author;
    }

    public void setAuthor(Novelis author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Novel : " +
                "Book Code = " + super.bookCode + '\'' +
                ", Title = " + super.title + '\'' +
                ", Author = " + author + '\'' +
                ", Publisher = " + super.publisher + '\'' +
                ", Price = " + super.price + '\'' +
                ", Genre = " + genre + '\'';
    }
}
