package com.twu.menuhandler;

import com.twu.biblioteca.LibraryNavigator;

public class ReturnBookHandler implements MenuHandler {

    final int RETURN_BOOK_CONSTANT = 3;
    MenuHandler succesor;

    public ReturnBookHandler(MenuHandler s){
        succesor = s;
    }

    @Override
    public void getHelp(int optionConstant, LibraryNavigator libraryNavigator) {
        if(optionConstant != RETURN_BOOK_CONSTANT){
            succesor.getHelp(optionConstant, libraryNavigator);
        } else {
            libraryNavigator.returnBook();
        }
    }
}
