package com.twu.menuhandler;

import com.twu.biblioteca.LibraryNavigator;

public class ListBooksHandler implements MenuHandler {

    final int LIST_BOOKS_CONSTANT = 1;
    MenuHandler succesor;

    public ListBooksHandler(MenuHandler s){
        succesor = s;
    }

    @Override
    public void getHelp(int optionConstant, LibraryNavigator libraryNavigator) {
        if(optionConstant != LIST_BOOKS_CONSTANT){
            succesor.getHelp(optionConstant, libraryNavigator);
        } else {
            libraryNavigator.library.listAvailableBooks();
        }
    }
}
