package org.example;

public class Subject {
    private String subjectName;
    private double score;
    private String grade;

    public String getSubjectName() {
        return subjectName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return subjectName + ":   "+score+"   -> " + grade;
    }
}


