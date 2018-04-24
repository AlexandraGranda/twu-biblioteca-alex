package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

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
}
