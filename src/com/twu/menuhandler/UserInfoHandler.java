package com.twu.menuhandler;

import com.twu.biblioteca.LibraryNavigator;

public class UserInfoHandler implements MenuHandler {
    final int USER_INFO_CONSTANT = 7;
    MenuHandler succesor;

    public UserInfoHandler(MenuHandler succesor){
        this.succesor = succesor;
    }

    @Override
    public void getHelp(int optionConstant, LibraryNavigator libraryNavigator) {
        if(optionConstant != USER_INFO_CONSTANT){
            succesor.getHelp(optionConstant, libraryNavigator);
        } else {
            if(libraryNavigator.isLogged){
                libraryNavigator.library.printUserInfo(libraryNavigator.userIndex);
            } else {
                System.out.println("You have to be logged in to access this functionality");
            }
        }
    }
}
