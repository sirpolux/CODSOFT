package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        printDeco(32,'*');
        System.out.println("***        STUDENT GRADE CALSULATOR       ***");
        printDeco(32,'*');
        System.out.println();
        System.out.print("Hello, may i have you name:  ");
        String playerName = scanner.nextLine();
        System.out.println();
        System.out.print("Nice to have you "+playerName);

    }
    static  int getUserInputNum(Scanner scanner, String text){
        System.out.print(text+ ":  ");
        return scanner.nextInt();
    }

    static  String getUserInputText(Scanner scanner, String text){
        System.out.print(text+ ":  ");
        return scanner.nextLine();
    }

    static void printDeco(int len, char character){
        String formattedString = String.format("%" + len + "c", character).replace(' ', character);
        System.out.println(formattedString);

    }
}