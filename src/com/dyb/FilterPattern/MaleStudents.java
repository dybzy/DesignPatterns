package com.dyb.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dyb
 * @date 2020-01-06 10:37
 * 男生
 */
public class MaleStudents implements Filter {
    @Override
    public List<Student> filter(List<Student> students) {
        List<Student> maleStudents=new ArrayList<>();
        for (Student student : students) {
            if(student.getGender().equalsIgnoreCase("male")){
                maleStudents.add(student);
            }
        }
        return maleStudents;
    }
}
