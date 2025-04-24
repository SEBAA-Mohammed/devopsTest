package org.est.devops.ms.tp3;

public class Student {
    private String id;
    private String name;
    private double grade;

    public Student(String id, String name, double initialGrade) {
        this.id = id;
        this.name = name;
        this.grade = initialGrade;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void updateGrade(double newGrade) {
        if (newGrade < 0 || newGrade > 20)
            throw new IllegalArgumentException("Invalid grade");
        grade = newGrade;
    }

    public double getGrade() {
        return grade;
    }
}
