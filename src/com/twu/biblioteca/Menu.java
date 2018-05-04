package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {
    protected String title;
    protected ArrayList<String> options;

    public Menu(String title) {
        this.title = title;
        options = new ArrayList<String>();
    }
}
