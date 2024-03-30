package com.kopiyama.entity;

import com.kopiyama.model.Author;
import com.kopiyama.model.Publisher;
import com.kopiyama.model.EBook;
import com.kopiyama.model.Novel;
import com.kopiyama.model.Comic;
import com.kopiyama.model.Novelis;

public class CommercialBookEntity {
    //EBook
    public static EBook ebook1 = new EBook("Book-001", "Memahami Hamka", AuthorEntity.author1, PublisherEntity.publisher3, 0.0);
    public static EBook ebook2 = new EBook("Book-002", "Head First Java: Your Brain on Java - A Learner's Guide", AuthorEntity.author2, PublisherEntity.publisher8, 0.0);
    public static EBook ebook3 = new EBook("Book-003", "Java For Dummies", AuthorEntity.author3, PublisherEntity.publisher8, 0.0);
    public static EBook ebook4 = new EBook("Book-004", "Flutter For Dummies", AuthorEntity.author3, PublisherEntity.publisher8, 0.0);
    public static EBook ebook5 = new EBook("Book-005", "The Subtle Art of Not Giving", AuthorEntity.author4, PublisherEntity.publisher9, 0.0);
    public static EBook ebook6 = new EBook("Book-006", "Will", AuthorEntity.author4, PublisherEntity.publisher9, 0.0);
    public static EBook ebook7 = new EBook("Book-007", "Sejarah Indonesia", AuthorEntity.author5, PublisherEntity.publisher6, 0.0);
    public static EBook ebook8 = new EBook("Book-008", "Teknologi Baru", AuthorEntity.author6, PublisherEntity.publisher5, 0.0);

    //Novel
    public static Novel novel1 = new Novel("Novel-001", "Harry Potter and the Philosopher's Stone", AuthorEntity.novelis1, PublisherEntity.publisher1, 0.0, "Fantasy", AuthorEntity.novelis1.getRating());
    public static Novel novel2 = new Novel("Novel-002", "Harry Potter and the Chamber of Secrets", AuthorEntity.novelis1, PublisherEntity.publisher1, 0.0, "Fantasy", AuthorEntity.novelis1.getRating());
    public static Novel novel3 = new Novel("Novel-003", "Harry Potter and the Prisoner of Azkaban", AuthorEntity.novelis1, PublisherEntity.publisher1, 0.0, "Fantasy", AuthorEntity.novelis1.getRating());
    public static Novel novel4 = new Novel("Novel-004", "Ayah Aku Berbeda", AuthorEntity.novelis2, PublisherEntity.publisher2, 0.0, "Drama", AuthorEntity.novelis2.getRating());
    public static Novel novel5 = new Novel("Novel-005", "Madre", AuthorEntity.novelis3, PublisherEntity.publisher2, 0.0, "Drama", AuthorEntity.novelis3.getRating());
    public static Novel novel6 = new Novel("Novel-006", "Lagu untuk Renjana", AuthorEntity.novelis4, PublisherEntity.publisher3, 0.0, "Drama", AuthorEntity.novelis4.getRating());
    public static Novel novel7 = new Novel("Novel-007", "Semoga Lekas Lega", AuthorEntity.novelis4, PublisherEntity.publisher3, 0.0, "Drama", AuthorEntity.novelis4.getRating());
    public static Novel novel8 = new Novel("Novel-008", "The Abbey Mystery", AuthorEntity.novelis5, PublisherEntity.publisher7, 0.0, "Fiction", AuthorEntity.novelis5.getRating());

    //Comic
    public static Comic comic1 = new Comic("Comic-001", "Uzumaki Naruto", AuthorEntity.mangaka1, PublisherEntity.publisher4, 0.0, true, 0.0, "Best Seller");
    public static Comic comic2 = new Comic("Comic-002", "The Worst Client", AuthorEntity.mangaka1, PublisherEntity.publisher4, 0.0, true, 0.0, "Best Seller");
    public static Comic comic3 = new Comic("Comic-003", "For the Sake of Dreams...!!", AuthorEntity.mangaka1, PublisherEntity.publisher4, 0.0, true, 0.0, "Best Seller");
    public static Comic comic4 = new Comic("Comic-004", "Hunter X Hunter : The Day of Departure", AuthorEntity.mangaka2, PublisherEntity.publisher4, 0.0, true, 0.0, "Good");
    public static Comic comic5 = new Comic("Comic-005", "Hunter X Hunter : A Struggle in the Mist", AuthorEntity.mangaka2, PublisherEntity.publisher4, 0.0, true, 0.0, "Good");
    public static Comic comic6 = new Comic("Comic-006", "One Piece", AuthorEntity.mangaka3, PublisherEntity.publisher2, 0.0, true, 0.0, "Best Seller");
    public static Comic comic7 = new Comic("Comic-007", "Petualangan di Indonesia", AuthorEntity.mangaka4, PublisherEntity.publisher6, 0.0, false, 0.0, "New Commer");
    public static Comic comic8 = new Comic("Comic-008", "Petualangan di Jakarta", AuthorEntity.mangaka5, PublisherEntity.publisher5, 0.0, false, 0.0, "New Commer");
}

