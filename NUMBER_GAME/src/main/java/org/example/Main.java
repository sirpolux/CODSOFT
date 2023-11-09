package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        printDeco(32,'*');
        System.out.println("***        NUMBER GAME       ***");
        printDeco(32,'*');
        System.out.println();
        System.out.print("Hello, may i have you name:  ");
        String playerName = scanner.nextLine();
        System.out.println();
        System.out.print("Nice to have you "+playerName);
        System.out.println();
        printDeco(32,'-');
        int rounds=getUserInputNum(scanner,"How many round do you want to play");
        //int maxAttempt=getUserInputNum(scanner,"Max attempt per round");
        int maxAttempt=7;
        System.out.println("Number range 1-100");

        printDeco(32,'-');
        int score=0;
        int pointsPerRound=10;


        for (int i=0; i<rounds; i++ ){
            int targetNumber = random.nextInt(100)+1;
            System.out.println(targetNumber);
            int attemptsLeft=maxAttempt;
            System.out.println("Generating number ...");
            System.out.println("Generate number: ###");
            System.out.println();
            System.out.println("Lets play...");
            while (attemptsLeft>0){
                System.out.println("Attempt left:  "+ attemptsLeft);
                int userGuess = getUserInputNum(scanner,"Guess ");
                if(userGuess == targetNumber){
                    score=score+(attemptsLeft*pointsPerRound);
                    rounds--;
                    System.out.println("Great job!");
                    attemptsLeft=0;
                    continue;
                }else if(userGuess>targetNumber) {
                    System.out.println("Too high, try again");
                    attemptsLeft--;
                }else{
                    System.out.println("Too low, try again");
                    attemptsLeft--;
                }
//                attemptsLeft=maxAttempt;
//                rounds--;
//                System.out.println();
            }
        }
        System.out.println();
        printDeco(32,'*');
        System.out.println("***         SCORE: "+score+"        ***");
        printDeco(32,'*');

    }

    static  int getUserInputNum(Scanner scanner, String text){
        System.out.print(text+ ":  ");
        return scanner.nextInt();
    }

    static String getUserInputText(Scanner scanner, String text){
        System.out.print(text+ ":  ");
        return scanner.nextLine();
    }

    static void printDeco(int len, char character){
        String formattedString = String.format("%" + len + "c", character).replace(' ', character);
        System.out.println(formattedString);

    }
}