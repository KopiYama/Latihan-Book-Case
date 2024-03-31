package com.kopiyama.ui;

import com.kopiyama.model.*;
import com.kopiyama.repository.RepositoryBook;

import java.util.List;
import java.util.Scanner;

public class AuthorMenu {
    public static void showAuthorMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Author Menu Searching");
            System.out.println("1. Cari Data semua Mangaka.");
            System.out.println("2. Cari Data semua Author.");
            System.out.println("3. Cari Data semua Novelis.");
            System.out.println("4. Cari author berdasarkan Range umur.");
            System.out.println("5. Cari author berdasarkan Country.");
            System.out.println("0. Back to Main Menu");
            System.out.print("Pilih menu: ");

            try {
                String input = scanner.nextLine();
                // Handle empty input
                if (input.trim().isEmpty()) {
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
                    continue; // Skip to the next iteration of the loop
                }
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        findAllMangaka();
                        break;
                    case 2:
                        findAllAuthors();
                        break;
                    case 3:
                        findAllNovelists();
                        break;
                    case 4:
                        findAuthorsByAgeRange();
                        break;
                    case 5:
                        findAuthorsByCountry();
                        break;
                    case 0:
                        MainMenu.main(null);
                        isRunning = false;
                        break;
                    default:
                        System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
            }
        }
    }


    private static void showPostSearchMenu1() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("99. Kembali ke menu Author Menu");
            System.out.println("98. Kembali ke Main Menu");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");

            try {
                String input = scanner.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.\n");
                    continue;
                }
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 99:
                        showAuthorMenu();
                        isRunning = false;
                        break;
                    case 98:
                        MainMenu.main(null);
                        isRunning = false;
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nPilihan tidak valid. Silakan coba lagi.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nPilihan tidak valid. Silakan coba lagi.\n");
            }
        }
    }

    private static void showPostSearchMenu2() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("97. Kembali cari data author berdasarkan range umur.");
            System.out.println("99. Kembali ke menu Author Menu");
            System.out.println("98. Kembali ke Main Menu");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");

            try {
                String input = scanner.nextLine();
                // Handle empty input
                if (input.trim().isEmpty()) {
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.\n");
                    continue; // Skip to the next iteration of the loop
                }

                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 97:
                        findAuthorsByAgeRange();
                        break;
                    case 99:
                        // Kembali ke menu BookMenu
                        showAuthorMenu();
                        isRunning = false;
                        break;
                    case 98:
                        // Kembali ke MainMenu
                        MainMenu.main(null);
                        isRunning = false;
                        break;
                    case 0:
                        // Keluar dari program
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nPilihan tidak valid. Silakan coba lagi.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nPilihan tidak valid. Silakan coba lagi.\n");
            }
        }
    }

    private static void showPostSearchMenu3() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("96. Kembali mencari author berdasarkan country");
            System.out.println("99. Kembali ke menu Author Menu");
            System.out.println("98. Kembali ke Main Menu");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");

            try {
                String input = scanner.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.\n");
                    continue;
                }
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 96:
                        findAuthorsByCountry();
                        break;
                    case 99:
                        showAuthorMenu();
                        isRunning = false;
                        break;
                    case 98:
                        MainMenu.main(null);
                        isRunning = false;
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nPilihan tidak valid. Silakan coba lagi.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nPilihan tidak valid. Silakan coba lagi.\n");
            }
        }
    }

    //Semua mangaka
    private static void findAllMangaka() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<AuthorImpl> authors = repositoryBook.getAllAuthors();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Daftar semua Mangaka:");
        boolean mangakaFound = false;
        for (AuthorImpl author : authors) {
            if (author instanceof Mangaka) {
                System.out.println(author);
                mangakaFound = true;
            }
        }

        if (!mangakaFound) {
            System.out.println("Tidak ada Mangaka yang ditemukan.");
        }
        showPostSearchMenu1();
    }

    //Semua Author
    private static void findAllAuthors() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<CommercialBook> books = repositoryBook.getAllBooks();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Daftar semua Author:");
        boolean authorFound = false;
        for (CommercialBook book : books) {
            if (book instanceof EBook) {
                AuthorImpl author = (AuthorImpl) book.getAuthor();
                System.out.println(author);
                authorFound = true;
            }
        }
        if (!authorFound) {
            System.out.println("Tidak ada Author yang menulis EBook.\n");
        }
        showPostSearchMenu1();
    }

    //Semua Novelis
    private static void findAllNovelists() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<AuthorImpl> authors = repositoryBook.getAllAuthors();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Daftar semua Novelis:\n");
        boolean novelistFound = false;
        for (AuthorImpl author : authors) {
            if (author instanceof Novelis) {
                System.out.println(author);
                novelistFound = true;
            }
        }

        if (!novelistFound) {
            System.out.println("Tidak ada Novelis yang ditemukan.");
        }
        showPostSearchMenu1();
    }

    //Range umur
    private static void findAuthorsByAgeRange() {
        Scanner scanner = new Scanner(System.in);
        RepositoryBook repositoryBook = new RepositoryBook();
        List<AuthorImpl> authors = repositoryBook.getAllAuthors();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Masukkan batas umur maksimum: ");
        String input = scanner.nextLine();

        // Handle empty input
        if (input.trim().isEmpty()) {
            System.out.println("\nInput tidak valid. Harus berupa angka.\n");
            showPostSearchMenu2(); // Show the post search menu again
            return; // Exit the method
        }

        int maxAge;
        try {
            maxAge = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("\nInput tidak valid. Harus berupa angka.\n");
            showPostSearchMenu2(); // Show the post search menu again
            return; // Exit the method
        }

        System.out.println("Author dengan umur " + maxAge + " tahun ke bawah:\n");
        boolean authorFound = false;
        for (AuthorImpl author : authors) {
            if (author.getAge() <= maxAge) {
                System.out.println(author);
                authorFound = true;
            }
        }

        if (!authorFound) {
            System.out.println("Tidak ada Author yang ditemukan dengan umur " + maxAge + " tahun ke bawah.\n");
        }
        showPostSearchMenu2();
    }

    //Cari author berdasarkan negara
    private static void findAuthorsByCountry() {
        Scanner scanner = new Scanner(System.in);
        RepositoryBook repositoryBook = new RepositoryBook();
        List<AuthorImpl> authors = repositoryBook.getAllAuthors();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Masukkan negara: ");
        String country = scanner.nextLine();

        System.out.println("Author dari negara " + country + ":\n");
        boolean authorFound = false;
        for (AuthorImpl author : authors) {
            if (author.getCountry().equalsIgnoreCase(country)) {
                System.out.println(author);
                authorFound = true;
            }
        }

        if (!authorFound) {
            System.out.println("Tidak ada Author yang ditemukan dari negara " + country + ".\n");
        }
        showPostSearchMenu3();
    }



}
