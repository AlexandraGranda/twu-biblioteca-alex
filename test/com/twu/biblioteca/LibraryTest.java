package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class LibraryTest {

    @Test
    public void addBooksToLibrary() {
        Library library = new Library();
        library.addBooksToLibrary();

        Assert.assertNotNull(library.books.get(0).title);
    }

    @Test
    public void validateAvailableBook() {
        char bookNumber = '7';
        Library library = new Library();
        library.addBooksToLibrary();
        boolean expectedResult = true;

        boolean actualResult = library.validateAvailableBook(bookNumber);

        Assert.assertEquals(expectedResult, actualResult);


    }

    @Test
    public void testAddMoviesToLibrary() {
        Library library = new Library();
        library.addMoviesToLibrary();

        Assert.assertNotNull(library.movies.get(0).name);
    }

    @Test
    public void testCheckoutBook(){
        int bookNumber = 7;
        int originalSize;
        Library library = new Library();
        library.addBooksToLibrary();
        originalSize = library.books.size();
        library.checkoutBook(bookNumber);

        Assert.assertEquals(1, library.lentBooks.size());
        Assert.assertEquals(originalSize-1, library.books.size());
    }

    @Test
    public void testReturnBook(){
        int bookNumber = 7;
        int originalSize;
        Library library = new Library();
        library.addBooksToLibrary();
        library.checkoutBook(bookNumber);
        originalSize = library.books.size();
        library.returnBook(0);

        Assert.assertEquals(originalSize+1, library.books.size());
    }

    @Test
    public void testCheckoutMovie(){
        int movieNumber = 4;
        int originalSize;
        Library library = new Library();
        library.addMoviesToLibrary();
        originalSize = library.movies.size();
        library.checkoutMovie(movieNumber);

        Assert.assertEquals(originalSize-1, library.movies.size());

    }
}