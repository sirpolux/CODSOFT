package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        printDeco(32,'*');
        System.out.println("***        STUDENT GRADE CALCULATOR       ***");
        printDeco(32,'*');
        System.out.println();
        System.out.print("Hello, may i have you name:  ");
        String teacherName = scanner.nextLine();
        System.out.println();
        System.out.print("Nice to have you "+teacherName);
        int totalSubjects=getUserInputNum(scanner,"Enter total subject offered by student");
        ArrayList<Subject> subjectList = new ArrayList<>();
        System.out.println("Total subject: "+totalSubjects);

        double total =0.0;
        double average=0.0;
        double percentage=0.0;


        for(int i =0; i<totalSubjects; i++){
            System.out.println("Subjects captured");
            Subject subject = new Subject();
            subject.setSubjectName(getUserInputText(scanner,"Subject:  "));
            subjectList.add(subject);
        }
        for (Subject subject:subjectList) {
            double score = getUserInputDouble(scanner,subject.getSubjectName());
            subject.setScore(score);
        }

    }
    static  int getUserInputNum(Scanner scanner, String text){
        System.out.print(text+ ":  ");
        return scanner.nextInt();
    }

    static  Double getUserInputDouble(Scanner scanner, String text){
        System.out.print(text+ ":  ");
        return scanner.nextDouble();
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