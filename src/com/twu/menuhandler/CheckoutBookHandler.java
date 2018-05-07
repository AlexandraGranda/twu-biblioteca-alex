package com.twu.menuhandler;

import com.twu.biblioteca.LibraryNavigator;

public class CheckoutBookHandler implements MenuHandler {

    final int CHECKOUT_BOOK_CONSTANT = 2;
    MenuHandler succesor;

    public CheckoutBookHandler(MenuHandler succesor){
        this.succesor = succesor;
    }

    @Override
    public void getHelp(int optionConstant, LibraryNavigator libraryNavigator) {
        if (optionConstant != CHECKOUT_BOOK_CONSTANT){
            succesor.getHelp(optionConstant, libraryNavigator);
        } else {
            libraryNavigator.checkout();
        }
    }
}
