package com.dyb.IteratorPattern;

/**
 * @author dyb
 * @date 2020-01-08 17:19
 */
public class BookShelf implements Aggregate{
    private Book[] books;
    int poiner=0;
    public BookShelf(int max_size){
        books=new Book[max_size];
    }
    public void appendBook(Book book){
        books[poiner]=book;
        poiner++;
    }
    public Book findBookAt(int index){
        return books[index];
    }
    public int getLength(){
        return poiner;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
