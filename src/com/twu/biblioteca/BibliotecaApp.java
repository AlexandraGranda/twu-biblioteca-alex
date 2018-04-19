package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        String answer;
        Scanner scanner = new Scanner(System.in);
        boolean correctOption = false;

        System.out.println("Welcome to Biblioteca! You are now entering the Library Management System of the Bangalore Public Library");

        printMenu();

        answer = scanner.nextLine();

        while (!correctOption) {

        }

    }

    public static void printMenu(){
        System.out.println("Main menu, please select an option:\n1.- List books\n2.- Quit");
    }
}
