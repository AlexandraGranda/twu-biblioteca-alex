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
}