package com.dyb.FilterPattern;

/**
 * @author dyb
 * @date 2020-01-06 10:33
 */
public class Student {
    private String name;
    private String gender;
    private Integer grade;
    public Student(String name, String gender, Integer grade) {
        super();
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", gender=" + gender + ", grade=" + grade + "]";
    }
}
