package com.twu.biblioteca;

import java.util.Scanner;

public class LibraryNavigator {

    private String answer;
    private char option;
    private Library library;
    private MenuCreator menuCreator;
    private int optionNumber;
    private Scanner scanner;
    private boolean quit;

    public  LibraryNavigator(){
        scanner = new Scanner(System.in);
        quit = false;
        library = new Library();
        menuCreator = new MenuCreator();
    }


    public void navigate() {

        library.addBooksToLibrary();
        library.addMoviesToLibrary();
        menuCreator.printWelcomeMessage();

        while (!quit) {
            menuCreator.printMenu();
            answer = scanner.nextLine();
            option = answer.charAt(0);

            if (!Character.isLetter(option)) {
                optionNumber = Integer.parseInt(option + "");
                switch (optionNumber) {
                    case 1:
                        library.listBooks();
                        break;
                    case 2:
                        checkout();
                        break;
                    case 3:
                        returnBook();
                        break;
                    case 4:
                        library.listMovies();
                        break;
                    case 5:
                        quit = true;
                        System.out.println("You are now exiting the Biblioteca system...");
                        break;
                    default:
                        System.out.println("Select a valid option!");
                        break;

                }

            } else {
                System.out.println("Select a valid option!, please enter only the number of the option you selected");
            }

        }
    }

    private void returnBook() {
        System.out.println("\nPlease enter the title of the book you want to return:");
        int bookIndex = 0;

        answer = scanner.nextLine();

        validateBelongingBook(bookIndex);
    }

    private void validateBelongingBook(int bookIndex) {
        boolean flag = false;

        for (int i = 0; i < library.books.size(); i++) {
            if (answer.equalsIgnoreCase(library.books.get(i).title)) {
                flag = true;
                bookIndex = i;
            }
        }

        if (flag && (library.books.get(bookIndex).isLent == true)) {
            library.books.get(bookIndex).returnBook();
            library.listBooks();
            System.out.println("\nThank you for returning the book: " + library.books.get(bookIndex).title);
        } else {
            System.out.println("\nThat is not a valid book to return");
        }
    }

    private void checkout() {
        char bookNumber;
        library.listBooks();
        System.out.println("\nPlease enter the number of the book you want to check out:");
        answer = scanner.nextLine();
        bookNumber = answer.charAt(0);
        library.validateAvailableBook(bookNumber);
    }


}
