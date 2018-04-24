package com.twu.biblioteca;

import java.util.Scanner;

public class LibraryNavigator {

    public void navigate(){
        String answer;
        char option;
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        Library library = new Library();
        int optionNumber;
        MenuCreator menuCreator = new MenuCreator();
        String bookNumber;

        addBooksToLibrary(library);
        menuCreator.printWelcomeMessage();

        while (!quit){
            menuCreator.printMenu();
            answer = scanner.nextLine();
            option = answer.charAt(0);

            if (!Character.isLetter(option)){
                optionNumber = Integer.parseInt(option+"");
                switch (optionNumber){
                    case 1:
                        library.listBooks();
                        break;
                    case 2:
                        checkout(scanner, library);
                        break;
                    case 4:
                        quit = true;
                        System.out.println("You are now exiting the Biblioteca system...");
                    default:
                        System.out.println("Select a valid option!");
                        break;

                }

            }
            else {
                System.out.println("Select a valid option!, please enter only the number of the option you selected");
            }

        }
    }

    private void checkout(Scanner scanner, Library library) {
        String bookNumber;
        Book checkedOutBook;
        System.out.println("Please enter the number of the book you want to check out:");
        bookNumber = scanner.nextLine();
        checkedOutBook = library.books.get(Integer.parseInt(bookNumber)-1);
        checkedOutBook.checkoutBook();
        System.out.println("\nThank you! Enjoy the book: "+checkedOutBook.title);
    }

    private void addBooksToLibrary(Library library) {
        library.books.add(new Book("The Killing Woods", "Lucy Christopher", "2014", false));
        library.books.add(new Book("The Mark of the Dragonfly", "Jaleigh Johnson", "2014", false));
        library.books.add(new Book("Defy", "Sara Larson", "2014", false));
        library.books.add(new Book("Great Expectations", "Charles Dickens", "1861", false));
        library.books.add(new Book("Moby-Dick", "Herman Melville", "1851", false));
        library.books.add(new Book("Crime and Punishment", "Fiodor Dostoievsky", "1866", false));
        library.books.add(new Book("To the Lighthouse", "Virginia Woolf", "1927", false));
    }
}
