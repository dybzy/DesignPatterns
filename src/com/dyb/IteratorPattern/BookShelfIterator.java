package com.dyb.IteratorPattern;

/**
 * @author dyb
 * @date 2020-01-09 8:33
 */
public class BookShelfIterator implements Iterator{
    BookShelf bookShelf;
    int index;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf=bookShelf;
        index=0;
    }
    @Override
    public boolean hasNext() {
        if(index<this.bookShelf.getLength()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        return bookShelf.findBookAt(index++);
    }
}
