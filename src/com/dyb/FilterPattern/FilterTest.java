package com.dyb.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dyb
 * @date 2020-01-06 10:52
 */
public class FilterTest {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();
        list.add(new Student("小明", "male", 1));
        list.add(new Student("小红", "female", 2));
        list.add(new Student("小刚", "male", 2));
        list.add(new Student("小霞", "female", 3));
        list.add(new Student("小智", "male", 3));
        list.add(new Student("虚无境", "male", 1));


        Filter male = new MaleStudents();
        Filter female = new FemaleStudents();
        Filter secondGrade = new SecondGrade();
        Filter secondGradeMale = new And(secondGrade, male);
        Filter secondGradeOrFemale = new Or(secondGrade, female);

        System.out.println("男生:"+male.filter(list));
        System.out.println("女生:"+female.filter(list));
        System.out.println("二年级学生:"+secondGrade.filter(list));
        System.out.println("二年级男生:"+secondGradeMale.filter(list));
        System.out.println("二年级的学生或女生:"+secondGradeOrFemale.filter(list));
    }
}
