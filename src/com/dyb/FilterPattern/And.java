package com.dyb.FilterPattern;

import java.util.List;

/**
 * @author dyb
 * @date 2020-01-06 10:49
 */
public class And implements Filter {
    private Filter filter;
    private Filter filter2;

    public And(Filter filter,Filter filter2) {
        this.filter=filter;
        this.filter2=filter2;
    }

    @Override
    public List<Student> filter(List<Student> students) {
        List<Student> students2=filter.filter(students);
        return filter2.filter(students2);
    }

}
