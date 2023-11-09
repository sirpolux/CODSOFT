package org.example;

public class Subject {
    private String subjectName;
    private double score;
    private String grade;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return subjectName + ":   "+score+"   -> " + grade;
    }
}


