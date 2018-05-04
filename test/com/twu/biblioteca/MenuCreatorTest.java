package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class MenuCreatorTest {
    @Test
    public void shouldPrintWelcomeMessage(){
        MenuCreator menuCreator = new MenuCreator();
        String expectedResult = "Welcome to Biblioteca! You are now entering the Library Management System of the Bangalore Public Library\nPlease enter the number of the option you choose";

        String actualResult = menuCreator.printWelcomeMessage();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMenuAttributes(){
        MenuCreator menuCreator = new MenuCreator();

        Assert.assertNotNull(menuCreator.printMenu().title);
        
    }


}
