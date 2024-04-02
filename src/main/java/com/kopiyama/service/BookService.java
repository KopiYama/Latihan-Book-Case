package com.kopiyama.service;

import com.kopiyama.model.Comic;
import com.kopiyama.model.CommercialBook;

import java.util.List;

public interface BookService {
    public CommercialBook findCheapestBook();

    public CommercialBook findMostExpensiveBook();

    public List<CommercialBook> findBooksByPriceRange(double maxPrice);

    public List<Comic> findComicsByMangakaRating(String rating);

    public List<CommercialBook> findBooksByPublisherCountry(String country);

    public List<CommercialBook> findBooksByAuthorCountry(String country);

    public Comic findMostExpensiveComic();
}
