package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {
    @Test
    public void shouldCheckoutBook(){
        Book book = new Book("Marley and Me", "I dont know", "2008", false);
        boolean expectedValue = true;
        book.checkoutBook();

        boolean actualValue = book.isLent;

        Assert.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testReturnBook(){
        Book book = new Book("Marley and Me", "I dont know", "2008", true);
        boolean expectedValue = false;
        book.returnBook();

        boolean actualValue = book.isLent;

        Assert.assertEquals(expectedValue, actualValue);
    }

}