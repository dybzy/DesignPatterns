package com.dyb.MVC;

/**
 * @author dyb
 * @date 2020-01-13 9:41
 * 创建视图
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
