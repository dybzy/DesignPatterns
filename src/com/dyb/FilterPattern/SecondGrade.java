package com.dyb.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dyb
 * @date 2020-01-06 10:47
 * 二年级学生
 */
public class SecondGrade implements Filter{
    @Override
    public List<Student> filter(List<Student> students) {

        List<Student> secondGradeStudents = new ArrayList<Student>();
        students.forEach(student->{
            if(student.getGrade() == 2){
                secondGradeStudents.add(student);
            }
        });

        return secondGradeStudents;
    }
}
