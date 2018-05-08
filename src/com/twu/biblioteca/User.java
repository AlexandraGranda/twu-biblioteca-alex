package com.twu.biblioteca;

public class User {
    String name;
    String email;
    String phone;
    String libraryNumber;
    String password;

    public User(String name, String email, String phone, String libraryNumber, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.libraryNumber = libraryNumber;
        this.password = password;
    }
}
