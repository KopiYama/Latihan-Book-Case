package com.kopiyama.ui;

import com.kopiyama.model.*;
import com.kopiyama.repository.RepositoryBook;
import com.kopiyama.entity.AuthorEntity;

import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BookMenu {
    public static void showBookMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Book Menu Searching");
            System.out.println("1. Cari data book yang memiliki price paling Murah.");
            System.out.println("2. Cari data book yang memiliki price paling Mahal.");
            System.out.println("3. Cari data book berdasarkan range Price.");
            System.out.println("4. Cari Comic Berdasarkan Rating mangaka.");
            System.out.println("5. Cari Book berdasarkan Country dari Publishernya.");
            System.out.println("6. Cari Book berdasarkan Country dari Authornya.");
            System.out.println("7. Cari data Comic yang memiliki price paling Mahal.");
            System.out.println("0. Back to Main Menu");
            System.out.print("Pilih menu: ");

            try {
                String input = scanner.nextLine();
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        findCheapestBook();
                        break;
                    case 2:
                        findMostExpensiveBook();
                        break;
                    case 3:
                        findBooksByPriceRange();
                        break;
                    case 4:
                        findComicsByMangakaRating();
                        break;
                    case 5:
                        findBooksByPublisherCountry();
                        break;
                    case 6:
                        findBooksByAuthorCountry();
                        break;
                    case 7:
                        findMostExpensiveComic();
                        break;
                    case 0:
                        MainMenu.main(null);
                        isRunning = false;
                        break;
                    default:
                        System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
                }
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void showPostSearchMenu1() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("99. Kembali ke menu Book Menu");
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
                        showBookMenu();
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
            System.out.println("97. Kembali cari data book berdasarkan range Price.");
            System.out.println("99. Kembali ke menu Book Menu");
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
                        findBooksByPriceRange();
                        break;
                    case 99:
                        // Kembali ke menu BookMenu
                        showBookMenu();
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
            System.out.println("96. Kembali mencari buku berdasarkan rating mangaka");
            System.out.println("99. Kembali ke menu Book Menu");
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
                        findComicsByMangakaRating();
                        break;
                    case 99:
                        showBookMenu();
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

    private static void showPostSearchMenu4() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("95. Kembali cari buku berdasarkan publisher country");
            System.out.println("99. Kembali ke menu Book Menu");
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
                    case 95:
                        findBooksByPublisherCountry();
                        break;
                    case 99:
                        showBookMenu();
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

    private static void showPostSearchMenu5() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("94. Kembali mencari buku berdasarkan Author Country");
            System.out.println("99. Kembali ke menu Book Menu");
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
                    case 94:
                        findBooksByAuthorCountry();
                        break;
                    case 99:
                        showBookMenu();
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

    //Method untuk mencari buku dengan price paling murah
    private static void findCheapestBook() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<CommercialBook> books = repositoryBook.getAllBooks();

        if (books.isEmpty()) {
            System.out.println("Tidak ada buku yang tersedia.");
            return;
        }

        CommercialBook cheapestBook = books.get(0);
        for (CommercialBook book : books) {
            if (book.getPrice() < cheapestBook.getPrice()) {
                cheapestBook = book;
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Buku dengan harga paling murah:");
        System.out.println(cheapestBook);
        showPostSearchMenu1();
    }

    //Method untuk mencari buku dengan harga paling mahal
    private static void findMostExpensiveBook() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<CommercialBook> books = repositoryBook.getAllBooks();

        if (books.isEmpty()) {
            System.out.println("Tidak ada buku yang tersedia.");
            return;
        }

        CommercialBook mostExpensiveBook = books.get(0);
        for (CommercialBook book : books) {
            if (book.getPrice() > mostExpensiveBook.getPrice()) {
                mostExpensiveBook = book;
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Buku dengan harga paling mahal:");
        System.out.println(mostExpensiveBook);
        showPostSearchMenu1();
    }
    //Method untuk mancari range harga
    private static void findBooksByPriceRange() {
        Scanner scanner = new Scanner(System.in);
        RepositoryBook repositoryBook = new RepositoryBook();
        List<CommercialBook> books = repositoryBook.getAllBooks();

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Masukkan batas harga maksimum: ");
        String input = scanner.nextLine();

        // Handle empty input
        if (input.trim().isEmpty()) {
            System.out.println("\nInput tidak valid. Harus berupa angka.\n");
            showPostSearchMenu2(); // Show the post search menu again
            return; // Exit the method
        }

        double maxPrice;
        try {
            maxPrice = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("\nInput tidak valid. Harus berupa angka.\n");
            showPostSearchMenu2(); // Show the post search menu again
            return; // Exit the method
        }

        System.out.println("Buku dengan harga " + maxPrice + " ke bawah:");
        boolean bookFound = false;
        for (CommercialBook book : books) {
            if (book.getPrice() <= maxPrice) {
                System.out.println(book);
                bookFound = true;
            }
        }

        if (!bookFound) {
            System.out.println("\nTidak ada buku yang ditemukan dengan harga " + maxPrice + " ke bawah.\n");
        }
        showPostSearchMenu2();
    }

    //Mencari rating mangaka
    private static void findComicsByMangakaRating() {
        Scanner scanner = new Scanner(System.in);
        RepositoryBook repositoryBook = new RepositoryBook();
        List<CommercialBook> books = repositoryBook.getAllBooks();

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Masukkan rating mangaka (Best Seller, Good, New Commer): ");
        String rating = scanner.nextLine();

        System.out.println("Komik dengan rating mangaka " + rating + ":" + '\n');
        boolean comicFound = false;
        for (CommercialBook book : books) {
            if (book instanceof Comic && ((Comic) book).getAuthor() instanceof Mangaka) {
                Mangaka mangaka = (Mangaka) book.getAuthor();
                if (mangaka.getRating().equalsIgnoreCase(rating)) {
                    System.out.println(book);
                    comicFound = true;
                }
            }
        }

        if (!comicFound) {
            System.out.println("Tidak ada komik yang ditemukan dengan rating mangaka " + rating + ".\n");
        }
        showPostSearchMenu3();
    }

    //Cari buku berdasarkan publisher country
    private static void findBooksByPublisherCountry() {
        Scanner scanner = new Scanner(System.in);
        RepositoryBook repositoryBook = new RepositoryBook();
        List<CommercialBook> books = repositoryBook.getAllBooks();

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Masukkan negara penerbit: ");
        String country = scanner.nextLine();

        System.out.println("Buku yang diterbitkan oleh penerbit dari " + country + ":\n");
        boolean bookFound = false;
        for (CommercialBook book : books) {
            if (book.getPublisher().getCountry().equalsIgnoreCase(country)) {
                System.out.println(book);
                bookFound = true;
            }
        }

        if (!bookFound) {
            System.out.println("Tidak ada buku yang ditemukan dengan penerbit dari negara " + country + ".\n");
        }
        showPostSearchMenu4();
    }

    //Mencari buku berdasarkan author country
    private static void findBooksByAuthorCountry() {
        Scanner scanner = new Scanner(System.in);
        RepositoryBook repositoryBook = new RepositoryBook();
        List<CommercialBook> books = repositoryBook.getAllBooks();

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Masukkan negara penulis: ");
        String country = scanner.nextLine();

        System.out.println("Buku yang ditulis oleh penulis dari " + country + ":\n");
        boolean bookFound = false;
        for (CommercialBook book : books) {
            Author author = book.getAuthor();
            if (author instanceof AuthorImpl) {
                AuthorImpl authorImpl = (AuthorImpl) author;
                if (authorImpl.getCountry().equalsIgnoreCase(country)) {
                    System.out.println(book);
                    bookFound = true;
                }
            }
        }

        if (!bookFound) {
            System.out.println("Tidak ada buku yang ditemukan dengan penulis dari negara " + country + ".\n");
        }
        showPostSearchMenu5();
    }

    //Mencari Comic paling mahal
    private static void findMostExpensiveComic() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<CommercialBook> books = repositoryBook.getAllBooks();

        Comic mostExpensiveComic = null;
        for (CommercialBook book : books) {
            if (book instanceof Comic) {
                if (mostExpensiveComic == null || book.getPrice() > mostExpensiveComic.getPrice()) {
                    mostExpensiveComic = (Comic) book;
                }
            }
        }

        if (mostExpensiveComic != null) {
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Komik dengan harga paling mahal:");
            System.out.println(mostExpensiveComic);
        } else {
            System.out.println("Tidak ada komik yang ditemukan.\n");
        }
        showPostSearchMenu1();
    }


}
