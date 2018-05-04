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
        Library library = new Library();
        library.addBooksToLibrary();

    }

    @Test
    public void addMoviesToLibrary() {
        addMoviesToLibrary();
    }
}