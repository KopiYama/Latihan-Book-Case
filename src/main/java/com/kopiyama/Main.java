package com.kopiyama;

import com.kopiyama.entity.CommercialBookEntity;
import com.kopiyama.model.CommercialBook;
import com.kopiyama.repository.RepositoryBook;
import com.kopiyama.ui.MainMenu;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Memanggil metode main dari kelas MainMenu
        MainMenu.main(args);
    }
//    public static void main(String[] args) {
//        RepositoryBook repositoryBook = new RepositoryBook();
//
//        // Memanggil metode getAllBooks dan menyimpan hasilnya ke dalam variabel books
//        List<CommercialBook> books = repositoryBook.getAllBooks();
//
//        // Menampilkan semua buku yang ada dalam daftar
//        for (CommercialBook book : books) {
//            System.out.println(book);
//        }
}