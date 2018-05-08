package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;


public class LibraryNavigatorTest {

    @Test
    public void quit() {
        LibraryNavigator libraryNavigator = new LibraryNavigator();
        libraryNavigator.quit();
        boolean expectedResult = true;

        boolean actualResult = libraryNavigator.quit;

        Assert.assertEquals(expectedResult, actualResult);
    }

}