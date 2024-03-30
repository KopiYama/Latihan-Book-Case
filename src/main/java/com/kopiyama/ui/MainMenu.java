package com.kopiyama.ui;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Main Menu");
            System.out.println("1. Book");
            System.out.println("2. Author");
            System.out.println("3. Publisher");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");

            try {
                String input = scanner.nextLine();
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        BookMenu.showBookMenu();
                        break;
                    case 2:
                        AuthorMenu.showAuthorMenu();
                        break;
                    case 3:
                        PublisherMenu.showPublisherMenu();
                        break;
                    case 0:
                        System.exit(0);
                        isRunning = false;
                        break;
                    default:
                        System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
                }
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }
}
