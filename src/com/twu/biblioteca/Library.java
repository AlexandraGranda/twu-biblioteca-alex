package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList();

    public ArrayList<Book> listBooks(){

        System.out.println("\nNo.\t\tTitle\t\t\t\t\t\t\tAuthor\t\t\t\t\tPublication Year");

        for (int i =0;i<books.size();i++) {
            if (books.get(i).isLent==false){
                System.out.printf("%-7.7s %-30.30s  %-22.22s  %-10.10s%n", ""+(i+1), books.get(i).title, books.get(i).author, books.get(i).yearPublished);
            }
        }

        return this.books;
    }

    protected void addBooksToLibrary() {
        books.add(new Book("The Killing Woods", "Lucy Christopher", "2014", false));
        books.add(new Book("The Mark of the Dragonfly", "Jaleigh Johnson", "2014", false));
        books.add(new Book("Defy", "Sara Larson", "2014", false));
        books.add(new Book("Great Expectations", "Charles Dickens", "1861", false));
        books.add(new Book("Moby-Dick", "Herman Melville", "1851", false));
        books.add(new Book("Crime and Punishment", "Fiodor Dostoievsky", "1866", false));
        books.add(new Book("To the Lighthouse", "Virginia Woolf", "1927", false));
    }

    protected void validateAvailableBook(String answer, char bookNumber) {
        Book checkedOutBook;
        if (Character.isLetter(bookNumber)){
            System.out.println("That book is not available");
        }
        else if (Integer.parseInt(bookNumber+"")>books.size()){
            System.out.println("That book is not available");
        }
        else if (books.get(Integer.parseInt(bookNumber+"")-1).isLent==true){
            System.out.println("That book is not available");
        }
        else {
            checkedOutBook = books.get(Integer.parseInt(answer)-1);
            checkedOutBook.checkoutBook();
            System.out.println("\nThank you! Enjoy the book: "+checkedOutBook.title);
        }
    }
}
