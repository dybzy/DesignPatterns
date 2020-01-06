package com.dyb.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dyb
 * @date 2020-01-06 10:40
 * 女生
 */
public class FemaleStudents implements Filter {
    @Override
    public List<Student> filter(List<Student> students) {
        List<Student> femaleStudents=new ArrayList<>();
        for (Student student : students) {
            if(student.getGender().equalsIgnoreCase("female")){
                femaleStudents.add(student);
            }
        }
        return femaleStudents;
    }
}
