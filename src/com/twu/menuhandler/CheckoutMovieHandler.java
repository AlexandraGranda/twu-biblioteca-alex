package com.twu.menuhandler;

import com.twu.biblioteca.LibraryNavigator;

public class CheckoutMovieHandler implements MenuHandler {
    final int CHECKOUT_MOVIE_CONSTANT = 5;
    MenuHandler succesor;

    public CheckoutMovieHandler(MenuHandler succesor){
        this.succesor = succesor;
    }

    @Override
    public void getHelp(int optionConstant, LibraryNavigator libraryNavigator) {
        if (optionConstant != CHECKOUT_MOVIE_CONSTANT){
            succesor.getHelp(optionConstant, libraryNavigator);
        } else {
            libraryNavigator.checkoutMovie();
        }
    }
}
