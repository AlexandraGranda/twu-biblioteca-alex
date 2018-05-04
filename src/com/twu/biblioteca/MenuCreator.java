package com.twu.biblioteca;

public class MenuCreator {

    private String welcomeMessage = "Welcome to Biblioteca! You are now entering the Library Management System of the Bangalore Public Library\nPlease enter the number of the option you choose";
    private String mainMenu = "\nMain menu:\n1.- List books\n2.- Checkout book\n3.- Return book\n4.- List Movies\n5.- Quit\n";

    public String printWelcomeMessage() {
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }

    public String printMenu(){
        System.out.println(mainMenu);
        return mainMenu;
    }
}
