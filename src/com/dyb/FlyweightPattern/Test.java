package com.dyb.FlyweightPattern;

import com.dyb.FilterPattern.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dyb
 * @date 2020-01-07 9:00
 */
public class Test {
    private static List<Book> books=new ArrayList<>();
    private static Llibrary llibrary;
    private static void studentBorrow(String bookName){
        books.add(llibrary.libToBorrow(bookName));
    }

    public static void main(String[] args) {
        llibrary=Llibrary.getInstance();
        studentBorrow("java编程思想");
        studentBorrow("java核心卷一");
        studentBorrow("java从入门到精通");
        System.out.println("还书后,后两本的内容不是太明白,就又借了一次");
        studentBorrow("java核心卷一");
        studentBorrow("java从入门到精通");
        for (Book book : books) {
            book.borrow();
        }
        //输出一些学生一共借出多少本书
        System.out.println("学生一共借了"+books.size()+"次书");
        //输出一下图书馆一共借出多少本书
        System.out.println("图书馆实际借出"+llibrary.getAllBookSize()+"本书");
    }
}
