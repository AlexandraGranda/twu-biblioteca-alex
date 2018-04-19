package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class BibliotecaTest {
    @Test
    public void listBooksTest(){
        Library library = new Library();
        ArrayList<Book> expectedResult = new ArrayList<Book>();

        ArrayList<Book> actualResult = library.listBooks();

        Assert.assertEquals(expectedResult, actualResult);
    }
}
