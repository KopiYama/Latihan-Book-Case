package com.kopiyama.service;

import com.kopiyama.model.Author;
import com.kopiyama.model.Mangaka;
import com.kopiyama.model.Novelis;

import java.util.List;

public interface AuthorService {
    public List<Mangaka> findAllMangaka();

    public List<Author> findAllAuthors();

    public List<Novelis> findAllNovelists();

    public List<Author> findAuthorsByAgeRange(int maxAge);

    public List<Author> findAuthorsByCountry(String country);

}
