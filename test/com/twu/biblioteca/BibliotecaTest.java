package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BibliotecaTest {
    @Test
    public void shouldPrintWelcomeMessage(){
        MenuCreator menuCreator = new MenuCreator();
        String expectedResult = "Welcome to Biblioteca! You are now entering the Library Management System of the Bangalore Public Library\nPlease enter the number of the option you choose";

        String actualResult = menuCreator.printWelcomeMessage();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldPrintMenu(){
        MenuCreator menuCreator = new MenuCreator();
        String expectedResult = "Main menu:\n1.- List books\n2.- Checkout book\n3.- Return book\n4.- Quit";

        String actualResult = menuCreator.printMenu();

        Assert.assertEquals(expectedResult, actualResult);
    }
}
