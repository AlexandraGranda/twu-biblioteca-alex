package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        String answer;
        char option;
        Scanner scanner = new Scanner(System.in);
        boolean correctOption = false;
        boolean quit = false;
        Library library = new Library();
        int optionNumber;
        MenuCreator menuCreator = new MenuCreator();

        addBooksToLibrary(library);
        menuCreator.printWelcomeMessage();


        menuCreator.printMenu();
        answer = scanner.nextLine();
        option = answer.charAt(0);

        if (!Character.isLetter(option)){
            optionNumber = Integer.parseInt(option+"");
            if (optionNumber>=1&&optionNumber<=4){
                correctOption = true;
                switch (optionNumber){
                    case 1:
                        library.listBooks();
                        break;
                    case 2:
                        break;
                    case 4:
                        quit = true;
                        System.out.println("You are now exiting the Biblioteca system...");
                    default:
                        break;

                }

            }
            else {
                System.out.println("Select a valid option!, please enter only the number of the option you selected");
                answer = scanner.nextLine();
                option = answer.charAt(0);
            }
        }
        else {
            System.out.println("Select a valid option!, please enter only the number of the option you selected");
            answer = scanner.nextLine();
            option = answer.charAt(0);
        }






    }

    private static void addBooksToLibrary(Library library) {
        library.books.add(new Book("The Killing Woods", "Lucy Christopher", "2014"));
        library.books.add(new Book("The Mark of the Dragonfly", "Jaleigh Johnson", "2014"));
        library.books.add(new Book("Defy", "Sara Larson", "2014"));
        library.books.add(new Book("Great Expectations", "Charles Dickens", "1861"));
        library.books.add(new Book("Moby-Dick", "Herman Melville", "1851"));
        library.books.add(new Book("Crime and Punishment", "Fiodor Dostoievsky", "1866"));
        library.books.add(new Book("To the Lighthouse", "Virginia Woolf", "1927"));
    }
}
