package com.kopiyama.entity;

import com.kopiyama.model.Author;
import com.kopiyama.model.Mangaka;
import com.kopiyama.model.Novelis;
import com.kopiyama.model.AuthorImpl;

public class AuthorEntity {
    //Objek AuthorImpl
    public static Author author1 = new AuthorImpl("Haidar", "Musyafa", "Indonesia", 30);
    public static Author author2 = new AuthorImpl("Bert", "Bates", "United State", 50);
    public static Author author3 = new AuthorImpl("Barry", "Burd", "United State", 52);
    public static Author author4 = new AuthorImpl("Mark", "Manson", "United State", 38);
    public static Author author5 = new AuthorImpl("Andi", "Susanto", "Indonesia", 32);
    public static Author author6 = new AuthorImpl("Adi", "Sutanto", "Indonesia", 27);

    //Objek Novelis
    public static Novelis novelis1 = new Novelis("J.K", "Rowling", "England", 57, true, "Best Seller");
    public static Novelis novelis2 = new Novelis("Tere", "Liye", "Indonesia", 35, true, "Best Seller");
    public static Novelis novelis3 = new Novelis("Dee", "Lestari", "Indonesia", 30, true, "Good");
    public static Novelis novelis4 = new Novelis("Faisal", "Syahreza", "Indonesia", 40, true, "New Commer");
    public static Novelis novelis5 = new Novelis("Julia", "Golding", "England", 41, false, "Best Seller");

    //Objek Mangaka
    public static Mangaka mangaka1 = new Mangaka("Masashi", "Kisimoto", "Japan", 48, "Best Seller");
    public static Mangaka mangaka2 = new Mangaka("Yoshihiro", "Togashi", "Japan", 56, "Good");
    public static Mangaka mangaka3 = new Mangaka("Eiichiro", "Oda", "Japan", 57, "Best Seller");
    public static Mangaka mangaka4 = new Mangaka("Rizki", "Anwar", "Indonesia", 25, "New Commer");
    public static Mangaka mangaka5 = new Mangaka("Yusuf", "Fadli", "Indonesia", 32, "New Commer");
}
