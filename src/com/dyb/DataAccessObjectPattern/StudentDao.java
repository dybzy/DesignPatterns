package com.dyb.DataAccessObjectPattern;

import java.util.List;

/**
 * @author dyb
 * @date 2020-01-13 15:17
 * 数据访问对象接口。
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}

