package com.dyb.FilterPattern;

import java.util.List;

/**
 * @author dyb
 * @date 2020-01-06 10:30
 * 抽象过滤器角色
 */
public interface Filter {
    public List<Student> filter(List<Student> students);
}
