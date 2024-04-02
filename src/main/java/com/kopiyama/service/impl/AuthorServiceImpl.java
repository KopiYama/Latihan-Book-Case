package com.kopiyama.service.impl;

import com.kopiyama.model.*;
import com.kopiyama.repository.RepositoryBook;
import com.kopiyama.service.AuthorService;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorServiceImpl implements AuthorService {
    private RepositoryBook repositoryBook;

    public AuthorServiceImpl(RepositoryBook repositoryBook) {
        this.repositoryBook = repositoryBook;
    }

    @Override
    public List<Mangaka> findAllMangaka() {
        return repositoryBook.getAllBooks().stream()
                .filter(book -> book instanceof Comic)
                .map(book -> (Comic) book)
                .map(Comic::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public List<Author> findAllAuthors() {
        return repositoryBook.getAllBooks().stream()
                .map(CommercialBook::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public List<Novelis> findAllNovelists() {
        return repositoryBook.getAllBooks().stream()
                .filter(book -> book instanceof Novel)
                .map(book -> (Novel) book)
                .map(Novel::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public List<Author> findAuthorsByAgeRange(int maxAge) {
        return findAllAuthors().stream()
                .filter(author -> author.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    @Override
    public List<Author> findAuthorsByCountry(String country) {
        return findAllAuthors().stream()
                .filter(author -> author.getCountry().equalsIgnoreCase(country))
                .collect(Collectors.toList());
    }
}
