package com.dyb.CompositePattern;

/**
 * @author dyb
 * @date 2020-01-06 13:38
 * 学校接口
 */
public interface School {
    void addPart(School company);
    void removePart(School company);

    void action();
}
