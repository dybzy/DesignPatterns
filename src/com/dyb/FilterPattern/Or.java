package com.dyb.FilterPattern;

import java.util.List;

/**
 * @author dyb
 * @date 2020-01-06 10:51
 */
public class Or implements Filter {
    private Filter filter;
    private Filter filter2;

    public Or(Filter filter,Filter filter2) {
        this.filter=filter;
        this.filter2=filter2;
    }

    @Override
    public List<Student> filter(List<Student> students) {
        List<Student> students1=filter.filter(students);
        List<Student> students2=filter2.filter(students);
        students2.forEach(student->{
            if(!students1.contains(student)){
                students1.add(student);
            }
        });
        return students1;
    }
}
