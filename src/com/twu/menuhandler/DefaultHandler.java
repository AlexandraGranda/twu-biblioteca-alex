package com.twu.menuhandler;

import com.twu.biblioteca.LibraryNavigator;

public class DefaultHandler implements MenuHandler {

    @Override
    public void getHelp(int optionConstant, LibraryNavigator libraryNavigator) {
        System.out.println("Select a valid option!");
    }
}
