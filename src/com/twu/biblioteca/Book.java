package com.twu.biblioteca;

public class Book {

    String title;
    String yearPublished;
    String author;
    boolean isLent;

    public Book(String title, String author, String yearPublished, boolean isLent){
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
        this.isLent = isLent;
    }

    public void checkoutBook() {
        isLent = true;
    }
}
