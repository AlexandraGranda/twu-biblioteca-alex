package com.twu.menuhandler;

import com.twu.biblioteca.LibraryNavigator;

public class ListMoviesHandler implements MenuHandler {

    final int LIST_MOVIES_CONSTANT = 4;
    MenuHandler succesor;

    public ListMoviesHandler(MenuHandler s){
        succesor = s;
    }

    @Override
    public void getHelp(int optionConstant, LibraryNavigator libraryNavigator) {
        if (optionConstant != LIST_MOVIES_CONSTANT){
            succesor.getHelp(optionConstant, libraryNavigator);
        } else {
            libraryNavigator.library.listAvailableMovies();
        }
    }
}
