package com.twu.biblioteca;

import java.util.Iterator;
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
                    case 3:
                        returnBook(scanner, library);
                        break;
                    case 4:
                        quit = true;
                        System.out.println("You are now exiting the Biblioteca system...");
                        break;
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

    private void returnBook(Scanner scanner, Library library) {
        String answer;
        System.out.println("\nPlease enter the title of the book you want to return:");
        boolean flag = false;
        int bookIndex = 0;

        answer = scanner.nextLine();

        for (int i =0;i<library.books.size();i++) {
            if (answer.equalsIgnoreCase(library.books.get(i).title)){
                flag = true;
                bookIndex = i;
            }
        }
        validateBelongingBook(library, flag, bookIndex);
    }

    private void validateBelongingBook(Library library, boolean flag, int bookIndex) {
        if (flag&&(library.books.get(bookIndex).isLent==true)){
            library.books.get(bookIndex).returnBook();
            library.listBooks();
            System.out.println("\nThank you for returning the book: "+library.books.get(bookIndex).title);
        }
        else {
            System.out.println("\nThat is not a valid book to return");
        }
    }

    private void checkout(Scanner scanner, Library library) {
        String answer;
        Book checkedOutBook;
        char bookNumber;
        library.listBooks();
        System.out.println("\nPlease enter the number of the book you want to check out:");
        answer = scanner.nextLine();
        bookNumber = answer.charAt(0);
        validateAvailableBook(library, answer, bookNumber);
    }

    private void validateAvailableBook(Library library, String answer, char bookNumber) {
        Book checkedOutBook;
        if (Character.isLetter(bookNumber)){
            System.out.println("That book is not available");
        }
        else if (Integer.parseInt(bookNumber+"")>library.books.size()){
            System.out.println("That book is not available");
        }
        else if (library.books.get(Integer.parseInt(bookNumber+"")-1).isLent==true){
            System.out.println("That book is not available");
        }
        else {
            checkedOutBook = library.books.get(Integer.parseInt(answer)-1);
            checkedOutBook.checkoutBook();
            System.out.println("\nThank you! Enjoy the book: "+checkedOutBook.title);
        }
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
