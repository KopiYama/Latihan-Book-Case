package com.kopiyama.model;

public class Comic extends CommercialBook {
    private boolean volumeSeries;
    private double Tax;
    private String rating;

    public Comic() {

    }

    public Comic(String bookCode, String title, Author author, Publisher publisher, double price, boolean volumeSeries, double tax, String rating) {
        super(bookCode, title, author, publisher, price);
        this.volumeSeries = volumeSeries;
        Tax = tax;
        this.rating = rating;
        calculatePrice();
        calculateTax();
    }

    public boolean isVolumeSeries() {
        return volumeSeries;
    }

    public void setVolumeSeries(boolean volumeSeries) {
        this.volumeSeries = volumeSeries;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double tax) {
        Tax = tax;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void calculateTax() {
        double comicPrice = this.getPrice();
        double tax = comicPrice * 0.05; // 5% dari Comic Price
        this.setTax(tax);
    }

    @Override
    public void calculatePrice() {
        double productionCost = this.getPublisher().getProductionCost();
        double comicPrice = 0;

        if (rating.equalsIgnoreCase("New Commer")) {
            if (volumeSeries) {
                comicPrice = productionCost * 1.35; // 135% dari Production Cost
            } else {
                comicPrice = productionCost * 1.25; // 125% dari Production Cost
            }
        } else if (rating.equalsIgnoreCase("Good")) {
            if (volumeSeries) {
                comicPrice = productionCost * 1.45; // 145% dari Production Cost
            } else {
                comicPrice = productionCost * 1.30; // 130% dari Production Cost
            }
        } else if (rating.equalsIgnoreCase("Best Seller")) {
            if (volumeSeries) {
                comicPrice = productionCost * 1.50; // 150% dari Production Cost
            } else {
                comicPrice = productionCost * 1.40; // 140% dari Production Cost
            }
        }
        this.setPrice(comicPrice);
    }

    @Override
    public String toString() {
        return "Comic:" + '\n' +
                "Book Code     = " + getBookCode() + '\n' +
                "Title         = " + getTitle() + '\n' +
                "Author        = " + getAuthor().getFullname() + '\n' +
                "Publisher     = " + getPublisher().getPublisherName() + '\n' +
                "Price         = " + getPrice() + '\n' +
                "Volume Series = " + volumeSeries + '\n' +
                "Tax           = " + Tax + '\n' +
                "Rating        = " + rating + '\n';
    }
}
