package com.kopiyama.view;

import com.kopiyama.model.*;
import com.kopiyama.model.Comic;
import com.kopiyama.service.impl.AuthorServiceImpl;
import com.kopiyama.service.impl.BookServiceImpl;
import com.kopiyama.service.impl.PublisherServiceImpl;

import java.util.List;
import java.util.Scanner;

public class MainView {
    private BookServiceImpl bookService;
    private AuthorServiceImpl authorService;
    private PublisherServiceImpl publisherService;

    public MainView(BookServiceImpl bookService, AuthorServiceImpl authorService, PublisherServiceImpl publisherService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.publisherService = publisherService;
    }

    public void showMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Main Menu");
            System.out.println("1. Book");
            System.out.println("2. Author");
            System.out.println("3. Publisher");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBookMenu();
                    break;
                case 2:
                    showAuthorMenu();
                    break;
                case 3:
                    showPublisherMenu();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private void showBookMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBook Menu");
            System.out.println("1. Find the cheapest book");
            System.out.println("2. Find the most expensive book");
            System.out.println("3. Find books by price range");
            System.out.println("4. Find comics by mangaka rating");
            System.out.println("5. Find books by publisher's country");
            System.out.println("6. Find books by author's country");
            System.out.println("7. Find the most expensive comic");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CommercialBook cheapestBook = bookService.findCheapestBook();
                    System.out.println("+------------+------------------------------------------------------------------------+------------------+------------------------+------------+");
                    System.out.println("| Book Code  |                           Title                                        |      Author      |        Publisher       |   Price    |");
                    System.out.println("+------------+------------------------------------------------------------------------+------------------+------------------------+------------+");
                    System.out.printf("| %-10s | %-70s | %-16s | %-22s | %-10.2f |\n", cheapestBook.getBookCode(), cheapestBook.getTitle(), cheapestBook.getAuthor().getFullName(), cheapestBook.getPublisher().getPublisherName(),cheapestBook.getPrice());
                    System.out.println("+------------+------------------------------------------------------------------------+------------------+------------------------+------------+");

                    break;
                case 2:
                    CommercialBook mostExpensiveBook = bookService.findMostExpensiveBook();
                    System.out.println("+------------+------------------------------------------------------------------------+------------------+------------------------+------------+");
                    System.out.println("| Book Code  |                           Title                                        |      Author      |     Publisher          |   Price    |");
                    System.out.println("+------------+------------------------------------------------------------------------+------------------+------------------------+------------+");
                    System.out.printf("| %-10s | %-70s | %-16s | %-22s | %-10.2f |\n", mostExpensiveBook.getBookCode(), mostExpensiveBook.getTitle(), mostExpensiveBook.getAuthor().getFullName(), mostExpensiveBook.getPublisher().getPublisherName(), mostExpensiveBook.getPrice());
                    System.out.println("+------------+------------------------------------------------------------------------+------------------+------------------------+------------+");
                    break;

                case 3:
                    System.out.print("Enter maximum price: ");
                    double maxPrice = scanner.nextDouble();
                    List<CommercialBook> booksInRange = bookService.findBooksByPriceRange(maxPrice);
                    System.out.println("+------------+------------------------------------------------------------------------+------------------+------------------------+------------+");
                    System.out.println("| Book Code  |                           Title                                        |      Author      |     Publisher          |   Price    |");
                    System.out.println("+------------+------------------------------------------------------------------------+------------------+------------------------+------------+");
                    for (CommercialBook book : booksInRange) {
                        System.out.printf("| %-10s | %-70s | %-16s | %-22s | %-10.2f |\n", book.getBookCode(), book.getTitle(), book.getAuthor().getFullName(), book.getPublisher().getPublisherName(), book.getPrice());
                    }
                    System.out.println("+------------+------------------------------------------------------------------------+------------------+------------------------+------------+");
                    break;

                case 4:
                    scanner.nextLine();
                    System.out.print("Enter mangaka rating (New Commer, Good, Best Seller): ");
                    String rating = scanner.nextLine();
                    List<Comic> comicsByRating = bookService.findComicsByMangakaRating(rating);
                    System.out.println("+------------+------------------------------------------------------------------------+------------------------+------------+-------------+");
                    System.out.println("| Comic Code |                           Title                                        |     Publisher          |   Rating   |    Price    |");
                    System.out.println("+------------+------------------------------------------------------------------------+------------------------+------------+-------------+");
                    for (Comic comic : comicsByRating) {
                        System.out.printf("| %-10s | %-70s | %-22s | %-10s | %-11.2f |\n", comic.getBookCode(), comic.getTitle(), comic.getPublisher().getPublisherName(), comic.getAuthor().getRating(), comic.getPrice());
                    }
                    System.out.println("+------------+------------------------------------------------------------------------+------------------------+------------+-------------+");
                    break;

                case 5:
                    scanner.nextLine();
                    System.out.print("Enter publisher's country : ");
                    String publisherCountry = scanner.nextLine().toUpperCase();
                    List<CommercialBook> booksByPublisherCountry = bookService.findBooksByPublisherCountry(publisherCountry);
                    System.out.println("+------------+------------------------------------------------------------------------+---------------------------------+------------------------+------------+");
                    System.out.println("| Book Code  |                           Title                                        |              Author             |     Publisher          |   Price    |");
                    System.out.println("+------------+------------------------------------------------------------------------+---------------------------------+------------------------+------------+");
                    for (CommercialBook book : booksByPublisherCountry) {
                        System.out.printf("| %-10s | %-70s | %-31s | %-22s | %-9.2f  |\n", book.getBookCode(), book.getTitle(), book.getAuthor().getFullName(), book.getPublisher().getPublisherName(), book.getPrice());
                    }
                    System.out.println("+------------+------------------------------------------------------------------------+---------------------------------+------------------------+------------+");
                    break;

                case 6:
                    scanner.nextLine(); // Menangkap newline karakter yang tersisa
                    System.out.print("Enter author's country : ");
                    String authorCountry = scanner.nextLine().toUpperCase();
                    List<CommercialBook> booksByAuthorCountry = bookService.findBooksByAuthorCountry(authorCountry);
                    System.out.println("+------------+------------------------------------------------------------------------+---------------------------------+------------------------+------------+--------------+");
                    System.out.println("| Book Code  |                           Title                                        |              Author             |     Publisher          |   Price    |   Country    |");
                    System.out.println("+------------+------------------------------------------------------------------------+---------------------------------+------------------------+------------+--------------+");
                    for (CommercialBook book : booksByAuthorCountry) {
                        System.out.printf("| %-10s | %-70s | %-31s | %-22s | %-10.2f | %-12s |\n", book.getBookCode(), book.getTitle(), book.getAuthor().getFullName(), book.getPublisher().getPublisherName(), book.getPrice(), book.getAuthor().getCountry());
                    }
                    System.out.println("+------------+------------------------------------------------------------------------+---------------------------------+------------------------+------------+--------------+");
                    break;

                case 7:
                    Comic mostExpensiveComic = bookService.findMostExpensiveComic();
                    System.out.println("+------------+------------------------------------------------------------------------+---------------------------------+------------------------+------------+----------+");
                    System.out.println("| Comic Code |                           Title                                        |              Author             |     Publisher          |   Price    |   Tax    |");
                    System.out.println("+------------+------------------------------------------------------------------------+---------------------------------+------------------------+------------+----------+");
                    System.out.printf("| %-10s | %-70s | %-31s | %-22s | %-9.2f  | %-8.2f |\n", mostExpensiveComic.getBookCode(), mostExpensiveComic.getTitle(), mostExpensiveComic.getAuthor().getFullName(), mostExpensiveComic.getPublisher().getPublisherName(), mostExpensiveComic.getPrice(), mostExpensiveComic.getTax());
                    System.out.println("+------------+------------------------------------------------------------------------+---------------------------------+------------------------+------------+----------+");
                    break;
//
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private void showAuthorMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nAuthor Menu");
            System.out.println("1. Find all Mangaka");
            System.out.println("2. Find all Authors");
            System.out.println("3. Find all Novelists");
            System.out.println("4. Find authors by age range");
            System.out.println("5. Find authors by country");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    List<Mangaka> allMangaka = authorService.findAllMangaka();
                    System.out.println("+-------------------------+-------------------+-----+--------------+");
                    System.out.println("|          Name           |      Country      | Age |    Rating    |");
                    System.out.println("+-------------------------+-------------------+-----+--------------+");
                    for (Mangaka mangaka : allMangaka) {
                        System.out.printf("| %-23s | %-17s | %-3d | %-12s |\n", mangaka.getFullName(), mangaka.getCountry(), mangaka.getAge(), mangaka.getRating());
                    }
                    System.out.println("+-------------------------+-------------------+-----+--------------+");
                    break;
                case 2:
                    List<Author> allAuthors = authorService.findAllAuthors();
                    System.out.println("All Authors:");
                    System.out.println("+-------------------------+-------------------+-----+");
                    System.out.println("|          Name           |      Country      | Age |");
                    System.out.println("+-------------------------+-------------------+-----+");
                    for (Author author : allAuthors) {
                        System.out.printf("| %-23s | %-17s | %-3d |\n", author.getFullName(), author.getCountry(), author.getAge());
                    }
                    System.out.println("+-------------------------+-------------------+-----+");
                    break;
                case 3:
                    List<Novelis> allNovelists = authorService.findAllNovelists();
                    System.out.println("All Novelists:");
                    System.out.println("+-------------------------+-------------------+-----+--------------+");
                    System.out.println("|          Name           |      Country      | Age |    Rating    |");
                    System.out.println("+-------------------------+-------------------+-----+--------------+");
                    for (Novelis novelis : allNovelists) {
                        System.out.printf("| %-23s | %-17s | %-3d | %-12s |\n", novelis.getFullName(), novelis.getCountry(), novelis.getAge(), novelis.getRating());
                    }
                    System.out.println("+-------------------------+-------------------+-----+--------------+");
                    break;
                case 4:
                    System.out.print("Enter maximum age: ");
                    int maxAge = scanner.nextInt();
                    List<Author> authorsByAgeRange = authorService.findAuthorsByAgeRange(maxAge);
                    System.out.println("+-------------------------+-------------------+-----+");
                    System.out.println("|          Name           |      Country      | Age |");
                    System.out.println("+-------------------------+-------------------+-----+");
                    for (Author author : authorsByAgeRange) {
                        System.out.printf("| %-23s | %-17s | %-3d |\n", author.getFullName(), author.getCountry(), author.getAge());
                    }
                    System.out.println("+-------------------------+-------------------+-----+");
                    break;
                case 5:
                    scanner.nextLine(); // Menangkap newline karakter yang tersisa
                    System.out.print("Enter author's country (Indonesia, England, United State, Japan): ");
                    String authorCountry = scanner.nextLine().toUpperCase();
                    List<Author> authorsByCountry = authorService.findAuthorsByCountry(authorCountry);
                    System.out.println("+-------------------------+-------------------+-----+");
                    System.out.println("|          Name           |      Country      | Age |");
                    System.out.println("+-------------------------+-------------------+-----+");
                    for (Author author : authorsByCountry) {
                        System.out.printf("| %-23s | %-17s | %-3d |\n", author.getFullName(), author.getCountry(), author.getAge());
                    }
                    System.out.println("+-------------------------+-------------------+-----+");
//                    System.out.println("Authors from " + authorCountry + ":");
//                    authorsByCountry.forEach(System.out::println);
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private void showPublisherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPublisher Menu");
            System.out.println("1. Find publisher with the highest production cost");
            System.out.println("2. Find publisher with the lowest production cost");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Publisher highestCostPublisher = publisherService.findPublisherWithHighestProductionCost();
                    System.out.println("+----------------------------+-------------------+------------+");
                    System.out.println("|       Publisher Name       |      Country      | Production |");
                    System.out.println("+----------------------------+-------------------+------------+");
                    System.out.printf("| %-26s | %-17s | %-9.2f  |\n", highestCostPublisher.getPublisherName(), highestCostPublisher.getCountry(), highestCostPublisher.getProductionCost());
                    System.out.println("+----------------------------+-------------------+------------+");
                    break;
                case 2:
                    Publisher lowestCostPublisher = publisherService.findPublisherWithLowestProductionCost();
                    System.out.println("+----------------------------+-------------------+------------+");
                    System.out.println("|       Publisher Name       |      Country      | Production |");
                    System.out.println("+----------------------------+-------------------+------------+");
                    System.out.printf("| %-26s | %-17s | %-9.2f  |\n", lowestCostPublisher.getPublisherName(), lowestCostPublisher.getCountry(), lowestCostPublisher.getProductionCost());
                    System.out.println("+----------------------------+-------------------+------------+");
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
