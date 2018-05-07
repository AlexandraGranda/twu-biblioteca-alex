package com.twu.menuhandler;

import com.twu.biblioteca.LibraryNavigator;

public class QuitHandler implements MenuHandler {
    final int QUIT_CONSTANT = 6;
    MenuHandler succesor;

    public QuitHandler(MenuHandler succesor){
        this.succesor = succesor;
    }

    @Override
    public void getHelp(int optionConstant, LibraryNavigator libraryNavigator) {
        if(optionConstant != QUIT_CONSTANT){
            succesor.getHelp(optionConstant, libraryNavigator);
        } else {
            libraryNavigator.quit();
            System.out.println("You are now exiting the Biblioteca System...");
        }
    }
}
