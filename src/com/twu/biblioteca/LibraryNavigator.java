package com.twu.biblioteca;

import java.util.Scanner;

public class LibraryNavigator {
    String answer;
    char option;
    Library library;
    MenuCreator menuCreator;
    int optionNumber;
    Scanner scanner;

    public void navigate(){
        scanner = new Scanner(System.in);
        boolean quit = false;
        library = new Library();
        menuCreator = new MenuCreator();

        library.addBooksToLibrary();
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
                        checkout();
                        break;
                    case 3:
                        returnBook();
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

    private void returnBook() {
        System.out.println("\nPlease enter the title of the book you want to return:");
        int bookIndex = 0;

        answer = scanner.nextLine();

        validateBelongingBook(bookIndex);
    }

    private void validateBelongingBook(int bookIndex) {
        boolean flag = false;

        for (int i =0;i<library.books.size();i++) {
            if (answer.equalsIgnoreCase(library.books.get(i).title)){
                flag = true;
                bookIndex = i;
            }
        }

        if (flag&&(library.books.get(bookIndex).isLent==true)){
            library.books.get(bookIndex).returnBook();
            library.listBooks();
            System.out.println("\nThank you for returning the book: "+library.books.get(bookIndex).title);
        }
        else {
            System.out.println("\nThat is not a valid book to return");
        }
    }

    private void checkout() {
        String answer;
        char bookNumber;
        library.listBooks();
        System.out.println("\nPlease enter the number of the book you want to check out:");
        answer = scanner.nextLine();
        bookNumber = answer.charAt(0);
        library.validateAvailableBook(answer, bookNumber);
    }


}
