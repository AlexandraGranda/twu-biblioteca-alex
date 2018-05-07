package com.twu.biblioteca;

import com.twu.menuhandler.*;

import java.util.Scanner;

public class LibraryNavigator {

    private String answer;
    private char option;
    public Library library;
    private MenuCreator menuCreator;
    private int optionNumber;
    private Scanner scanner;
    private boolean quit;
    private boolean isLogged;

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

                ListBooksHandler listBooksHandler = new ListBooksHandler(new CheckoutBookHandler(new ReturnBookHandler(new ListMoviesHandler(new CheckoutMovieHandler(new QuitHandler(new DefaultHandler()))))));

                listBooksHandler.getHelp(optionNumber, this);

            } else {
                System.out.println("Select a valid option!, please enter only the number of the option you selected");
            }

        }
    }

    public void checkoutMovie() {
        char movieNumber;
        library.listAvailableMovies();
        System.out.println("\nPlease enter the number of the movie you want to check out");
        answer = scanner.nextLine();
        movieNumber = answer.charAt(0);
        if(library.validateAvailableMovie(movieNumber)){
            library.checkoutMovie(Integer.parseInt(movieNumber+"")-1);
        }
    }

    public void returnBook() {
        library.listLentBooks();
        System.out.println("\nPlease enter the title of the book you want to return:");

        answer = scanner.nextLine();

        validateBelongingBook();
    }

    private void validateBelongingBook() {
        boolean flag = false;
        int bookIndex = 0;

        for (int i = 0; i < library.lentBooks.size(); i++) {
            if (answer.equalsIgnoreCase(library.lentBooks.get(i).title)) {
                flag = true;
                bookIndex = i;
            }
        }

        if (flag) {
            library.returnBook(bookIndex);
            library.listAvailableBooks();
            System.out.println("\nThank you for returning the book: " + library.books.get(library.books.size()-1).title);
        } else {
            System.out.println("\nThat is not a valid book to return");
        }
    }

    public void checkout() {
        char bookNumber;
        library.listAvailableBooks();
        System.out.println("\nPlease enter the number of the book you want to check out:");
        answer = scanner.nextLine();
        bookNumber = answer.charAt(0);
        if(library.validateAvailableBook(bookNumber)){
            library.checkoutBook(Integer.parseInt(bookNumber+""));
        }
    }

    public void quit(){
        this.quit = true;
    }


}
