package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    ArrayList<Book> books = new ArrayList();

    public ArrayList<Book> listBooks(){

        System.out.println("Title\t\tAuthor\t\tPublication Year");

        for (Book book: books) {

            System.out.println(book.title+"\t\t"+book.author+"\t\t"+book.yearPublished);
        }

        return this.books;
    }
}
