package com.dyb.IteratorPattern;

/**
 * @author dyb
 * @date 2020-01-09 8:43
 */
public class Text {
    public static void main(String[] args) {
        Book book1 = new Book("朝花夕拾");
        Book book2 = new Book("围城");
        Book book3 = new Book("遮天");
        Book book4 = new Book("寻秦记");
        Book book5 = new Book("骆驼祥子");

        BookShelf bookShelf = new BookShelf(5);

        bookShelf.appendBook(book1);
        bookShelf.appendBook(book2);
        bookShelf.appendBook(book3);
        bookShelf.appendBook(book4);
        bookShelf.appendBook(book5);

        Iterator it= bookShelf.iterator();
        while(it.hasNext()){
            Book book=(Book)it.next();
            System.out.println("书的名字为《"+book.getName()+"》");
        }
    }
}
