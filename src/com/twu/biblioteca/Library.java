package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    ArrayList<Book> books = new ArrayList();

    public ArrayList<Book> listBooks(){

        System.out.println("No.\t\tTitle\t\t\t\t\t\t\tAuthor\t\t\t\t\tPublication Year");
        int i = 0;

        for (Book book: books) {


            System.out.printf("%-7.7s %-30.30s  %-22.22s  %-10.10s%n", ""+(++i), book.title, book.author, book.yearPublished);
        }

        return this.books;
    }
}
