package com.kopiyama.repository;

import com.kopiyama.entity.AuthorEntity;
import com.kopiyama.entity.CommercialBookEntity;
import com.kopiyama.entity.PublisherEntity;
import com.kopiyama.model.AuthorImpl;
import com.kopiyama.model.CommercialBook;
import com.kopiyama.model.Publisher;

import java.util.ArrayList;
import java.util.List;

public class RepositoryBook {
    // Default Constructor
    public RepositoryBook() {
    }

    // Method untuk mendapatkan semua buku
    public List<CommercialBook> getAllBooks() {
        List<CommercialBook> books = new ArrayList<>();

        // Menambahkan semua buku ke dalam daftar
        books.add(CommercialBookEntity.ebook1);
        books.add(CommercialBookEntity.ebook2);
        books.add(CommercialBookEntity.ebook3);
        books.add(CommercialBookEntity.ebook4);
        books.add(CommercialBookEntity.ebook5);
        books.add(CommercialBookEntity.ebook6);
        books.add(CommercialBookEntity.ebook7);
        books.add(CommercialBookEntity.ebook8);

        books.add(CommercialBookEntity.novel1);
        books.add(CommercialBookEntity.novel2);
        books.add(CommercialBookEntity.novel3);
        books.add(CommercialBookEntity.novel4);
        books.add(CommercialBookEntity.novel5);
        books.add(CommercialBookEntity.novel6);
        books.add(CommercialBookEntity.novel7);
        books.add(CommercialBookEntity.novel8);

        books.add(CommercialBookEntity.comic1);
        books.add(CommercialBookEntity.comic2);
        books.add(CommercialBookEntity.comic3);
        books.add(CommercialBookEntity.comic4);
        books.add(CommercialBookEntity.comic5);
        books.add(CommercialBookEntity.comic6);
        books.add(CommercialBookEntity.comic7);
        books.add(CommercialBookEntity.comic8);

        return books;
    }

    public List<AuthorImpl> getAllAuthors() {
        List<AuthorImpl> authors = new ArrayList<>();

        // Tambahkan semua objek AuthorImpl ke dalam daftar
        authors.add((AuthorImpl) AuthorEntity.author1);
        authors.add((AuthorImpl) AuthorEntity.author2);
        authors.add((AuthorImpl) AuthorEntity.author3);
        authors.add((AuthorImpl) AuthorEntity.author4);
        authors.add((AuthorImpl) AuthorEntity.author5);
        authors.add((AuthorImpl) AuthorEntity.author6);

        // Tambahkan semua objek Novelis ke dalam daftar
        authors.add(AuthorEntity.novelis1);
        authors.add(AuthorEntity.novelis2);
        authors.add(AuthorEntity.novelis3);
        authors.add(AuthorEntity.novelis4);
        authors.add(AuthorEntity.novelis5);

        // Tambahkan semua objek Mangaka ke dalam daftar
        authors.add(AuthorEntity.mangaka1);
        authors.add(AuthorEntity.mangaka2);
        authors.add(AuthorEntity.mangaka3);
        authors.add(AuthorEntity.mangaka4);
        authors.add(AuthorEntity.mangaka5);

        return authors;
    }

    public List<Publisher> getAllPublishers() {
        List<Publisher> publishers = new ArrayList<>();

        // Tambahkan semua objek Publisher ke dalam daftar
        publishers.add(PublisherEntity.publisher1);
        publishers.add(PublisherEntity.publisher2);
        publishers.add(PublisherEntity.publisher3);
        publishers.add(PublisherEntity.publisher4);
        publishers.add(PublisherEntity.publisher5);
        publishers.add(PublisherEntity.publisher6);
        publishers.add(PublisherEntity.publisher7);
        publishers.add(PublisherEntity.publisher8);
        publishers.add(PublisherEntity.publisher9);

        return publishers;
    }
}
