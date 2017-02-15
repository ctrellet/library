package com.library.app;



import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class LibraryTest {

     @Test
     public void baseTest() {

        //set
        Book book1 = new Book("Book1",10);
        Book book2 = new Book("Book2",20);
        ArrayList<Book> myBooks = new ArrayList<Book>();
        myBooks.add(book1);
        myBooks.add(book2);
        Library myLib = new Library();

        //test
        ArrayList<Book> finalList = myLib.putBooks(myBooks);
        int listSize =  finalList.size();

        //assert
        assertEquals(2,listSize);
    }
}
