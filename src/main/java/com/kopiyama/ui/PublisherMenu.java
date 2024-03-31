package com.kopiyama.ui;

import com.kopiyama.model.Publisher;
import com.kopiyama.repository.RepositoryBook;

import java.util.List;
import java.util.Scanner;

public class PublisherMenu {
    public static void showPublisherMenu() {
        Scanner scanner = new Scanner(System.in);
        RepositoryBook repositoryBook = new RepositoryBook();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Publisher Menu Searching");
            System.out.println("1. Cari Publisher dengan productionCost paling Mahal.");
            System.out.println("2. Cari Publisher dengan productionCost paling Murah.");
            System.out.println("0. Back to Main Menu");
            System.out.print("Pilih menu: ");

            try {
                String input = scanner.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
                    continue;
                }
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        // Implementasi pencarian publisher dengan productionCost paling mahal
                        findPublisherWithHighestProductionCost();
                        break;
                    case 2:
                        // Implementasi pencarian publisher dengan productionCost paling murah
                        findPublisherWithLowestProductionCost();
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
            System.out.println("99. Kembali ke menu Publisher Menu");
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
                        showPublisherMenu();
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

    //Cari publisher paling mahal cost nya
    private static void findPublisherWithHighestProductionCost() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<Publisher> publishers = repositoryBook.getAllPublishers();

        if (publishers.isEmpty()) {
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Tidak ada publisher yang tersedia.");
            return;
        }

        Publisher highestCostPublisher = publishers.get(0);
        for (Publisher publisher : publishers) {
            if (publisher.getProductionCost() > highestCostPublisher.getProductionCost()) {
                highestCostPublisher = publisher;
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Publisher dengan production cost paling mahal:");
        System.out.println(highestCostPublisher);
        showPostSearchMenu1();
    }

    private static void findPublisherWithLowestProductionCost() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<Publisher> publishers = repositoryBook.getAllPublishers();

        if (publishers.isEmpty()) {
            System.out.println("Tidak ada publisher yang tersedia.");
            return;
        }

        Publisher lowestCostPublisher = publishers.get(0);
        for (Publisher publisher : publishers) {
            if (publisher.getProductionCost() < lowestCostPublisher.getProductionCost()) {
                lowestCostPublisher = publisher;
            }
        }

        System.out.println("Publisher dengan production cost paling murah:");
        System.out.println(lowestCostPublisher);
        showPostSearchMenu1();
    }


}
