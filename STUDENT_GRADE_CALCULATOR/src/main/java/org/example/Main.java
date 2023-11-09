package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        printDeco(50,'*');
        System.out.println("***        STUDENT GRADE CALCULATOR       ***");
        printDeco(50,'*');
        System.out.println();
        System.out.print("Hello, may i have you name:  ");
        String teacherName = scanner.nextLine();
        System.out.println();
        System.out.print("Nice to have you "+teacherName +"\n");
        int totalSubjects=getUserInputNum(scanner,"Enter total subject offered by student");
        ArrayList<Subject> subjectList = new ArrayList<>();
        System.out.println("Total subject: "+totalSubjects);

        double total =0.0;
        int maxScore=100;

        Scanner scanner1 = new Scanner(System.in);
        printDeco(50,'_');
        for(int i =0; i<totalSubjects; i++){
            System.out.println("Subjects captured:  "+ i);
            Subject subject = new Subject();
            subject.setSubjectName(getUserInputText(scanner1,"Subject:  "));
            subjectList.add(subject);
        }
        printDeco(50,'_');

        for (Subject subject:subjectList) {
            double score = getUserInputDouble(scanner1,subject.getSubjectName());
            subject.setScore(score);
            subject.setGrade(computeGrade(score));
            total+=score;
        }

        //PRINT STUDENT PERFORMANCE
        double averagePercentage = ((double) total / (totalSubjects * maxScore)) * 100;
        System.out.println();
        printDeco(50,'_');
        subjectList.forEach(Main::printStudentGrade);
        printDeco(50,'_');
        System.out.println("The total scores is: " + total);
        System.out.printf("The average percentage of the scores is: %.2f",averagePercentage);
        System.out.print("%");

        //average = total/totalSubjects;
        scanner1.close();
        scanner.close();

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

     static String computeGrade(double score){
        if (score>=70){
            return "A";
        }
        if(score>=60){
            return "B";
        }
        if(score>=50){
            return "C";
        }
        if (score>=45){
            return "D";
        }
        return  "E";
    }
    static void printStudentGrade(Subject subject){
        System.out.println(subject.getSubjectName() + "  Score: " +subject.getScore()+ "  -> "+subject.getGrade());
    }
}