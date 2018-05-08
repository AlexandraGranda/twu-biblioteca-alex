package com.twu.menuhandler;

import com.twu.biblioteca.LibraryNavigator;

public class LoginHandler implements MenuHandler {
    final int LOGIN_CONSTANT = 6;
    MenuHandler succesor;

    public LoginHandler(MenuHandler succesor){
        this.succesor = succesor;
    }

    @Override
    public void getHelp(int optionConstant, LibraryNavigator libraryNavigator) {
        if (optionConstant != LOGIN_CONSTANT){
            succesor.getHelp(optionConstant, libraryNavigator);
        }
        else {
            libraryNavigator.login();
        }
    }
}
