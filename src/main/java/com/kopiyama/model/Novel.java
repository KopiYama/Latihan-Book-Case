package com.kopiyama.model;

public class Novel extends CommercialBook{
    private String genre;
    private String rating;

    public Novel(){

    }

    public Novel(String bookCode, String title, Author author, Publisher publisher, double price, String genre, String rating) {
        super(bookCode, title, author, publisher, price);
        this.genre = genre;
        this.rating = rating;
        calculatePrice();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public void calculatePrice() {
        double productionCost = this.getPublisher().getProductionCost();
        double novelPrice = 0;

        if (rating.equalsIgnoreCase("New Commer")) {
            novelPrice = productionCost * 1.25; // 125% dari Production Cost
        } else if (rating.equalsIgnoreCase("Good")) {
            novelPrice = productionCost * 1.35; // 135% dari Production Cost
        } else if (rating.equalsIgnoreCase("Best Seller")) {
            novelPrice = productionCost * 1.50; // 150% dari Production Cost
        }
        this.setPrice(novelPrice);
    }

    @Override
    public String toString() {
        return "Novel:" + '\n' +
                "Book Code = " + getBookCode() + '\n' +
                "Title     = " + getTitle() + '\n' +
                "Author    = " + getAuthor().getFullname() + '\n' +
                "Publisher = " + getPublisher().getPublisherName() + '\n' +
                "Price     = " + getPrice() + '\n' +
                "Genre     = " + genre + '\n' +
                "Rating    = " + rating + '\n';
    }
}
