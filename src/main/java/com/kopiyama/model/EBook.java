package com.kopiyama.model;

public class EBook extends CommercialBook{
    public EBook() {

    }

    public EBook(String bookCode, String title, Author author, Publisher publisher, double price) {
        super(bookCode, title, author, publisher, price);
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        double productionCost = getPublisher().getProductionCost();
        double ebookPrice = productionCost * 1.20; // 120% dari Production Cost
        this.setPrice(ebookPrice);
    }

    @Override
    public String toString() {
        return "EBook:" + '\n' +
                "Book Code  = " + getBookCode() + '\n' +
                "Title      = " + getTitle() + '\n' +
                "Author     = " + getAuthor().getFullname() + '\n' +
                "Publisher  = " + getPublisher().getPublisherName() + '\n' +
                "Price      = " + getPrice() + '\n';
    }
}
