package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    protected ArrayList<Book> books;
    protected ArrayList<Book> lentBooks;
    protected ArrayList<Movie> movies;
    protected ArrayList<Movie> lentMovies;

    public Library() {
        books = new ArrayList<Book>();
        lentBooks = new ArrayList<Book>();
        movies = new ArrayList<Movie>();
        lentMovies = new ArrayList<Movie>();
    }


    public ArrayList<Book> listAvailableBooks(){

        System.out.println("\nNo.\t\tTitle\t\t\t\t\t\t\tAuthor\t\t\t\t\tPublication Year");

        for (int i =0;i<books.size();i++) {
            System.out.printf("%-7.7s %-30.30s  %-22.22s  %-10.10s%n", ""+(i+1), books.get(i).title, books.get(i).author, books.get(i).yearPublished);
        }

        return this.books;
    }
    public ArrayList<Book> listLentBooks(){

        System.out.println("\nNo.\t\tTitle\t\t\t\t\t\t\tAuthor\t\t\t\t\tPublication Year");

        for (int i = 0; i < lentBooks.size() ; i++) {
            System.out.printf("%-7.7s %-30.30s  %-22.22s  %-10.10s%n", ""+(i+1), lentBooks.get(i).title, lentBooks.get(i).author, lentBooks.get(i).yearPublished);
        }

        return this.lentBooks;
    }

    public ArrayList<Movie> listMovies(){
        System.out.println("\nNo.\t\tTitle\t\t\t\t\tDirector\t\t\t\t\tYear\t\tRating");

        for (int i = 0 ; i < movies.size() ; i++){
            Movie movie = movies.get(i);
            System.out.printf("%-7.7s %-22.22s  %-26.26s  %-11.11s %4.4s%n", ""+(i+1), movie.name, movie.director, movie.year, (movie.rating!=0) ? movie.rating : "None");

        }
        return this.movies;
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

    protected boolean validateAvailableBook(char bookNumber) {
        boolean availableBook = false;
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
            availableBook = true;
        }
        return availableBook;
    }

    protected void addMoviesToLibrary(){
        movies.add(new Movie("Tootsie", "1982", "Sydney Pollack", 0));
        movies.add(new Movie("The Godfather", "1972", "Francis Ford Coppola", 9));
        movies.add(new Movie("Annie Hall", "1977", "Woody Allen", 8));
        movies.add(new Movie("The Red Shoes", "1948", "Michael Powell", 7));
        movies.add(new Movie("Taxi Driver", "1976", "Martin Scorsese", 10));
        movies.add(new Movie("The Wizard of Oz", "1939", "Victor Fleming", 7));
        movies.add(new Movie("The Shining", "1980", "Stanley Kubrick", 10));
    }

    public void checkoutBook(int bookNumber) {
        Book aux = books.get(bookNumber-1);
        books.remove(bookNumber-1);
        lentBooks.add(aux);
        System.out.println("Thank you! Enjoy the book: "+aux.title);
    }

    public void returnBook(int bookNumber){
        Book aux = lentBooks.get(bookNumber);
        lentBooks.remove(bookNumber);
        books.add(aux);
    }
}
