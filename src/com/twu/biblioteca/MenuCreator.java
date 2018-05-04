package com.twu.biblioteca;

public class MenuCreator {
    private Menu menu;
    private String welcomeMessage;

    public MenuCreator() {
        this.welcomeMessage = "Welcome to Biblioteca! You are now entering the Library Management System of the Bangalore Public Library\nPlease enter the number of the option you choose";
        this.menu = new Menu("\nMain Menu:\n");
        addOptions();
    }

    public String printWelcomeMessage() {
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }

    public void printMenu(){
        System.out.println(menu.title);
        for (int i = 0; i < menu.options.size(); i++) {
            System.out.println((i+1)+".- "+menu.options.get(i));
        }
    }

    public void addOptions(){
        menu.options.add("List books");
        menu.options.add("Checkout book");
        menu.options.add("Return book");
        menu.options.add("List Movies");
        menu.options.add("Quit");
    }

}
