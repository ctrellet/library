package com.library.app;



import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class LibraryTest {

    @Test
    public void bookBaseTest() {

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

    @Test
    public void CdBaseTest() {

        //set
        Cd cd1 = new Cd("Cd1",10);
        Cd cd2 = new Cd("Cd2",20);
        ArrayList<Cd> myCds = new ArrayList<Cd>();
        myCds.add(cd1);
        myCds.add(cd2);
        Library myLib = new Library();

        //test
        ArrayList<Cd> finalList = myLib.putCds(myCds);
        int listSize =  finalList.size();

        //assert
        assertEquals(2,listSize);
    }

    @Test
    public void DvdBaseTest() {

        //set
        Dvd dvd1 = new Dvd("Dvd1",10, true, Movie.ACTION);
        Dvd dvd2 = new Dvd("Dvd2",20, false, Movie.FUN);
        ArrayList<Dvd> myDvds = new ArrayList<Dvd>();
        myDvds.add(dvd1);
        myDvds.add(dvd2);
        Library myLib = new Library();

        //test
        ArrayList<Dvd> finalList = myLib.putDvds(myDvds);
        int listSize =  finalList.size();

        //assert
        assertEquals(2,listSize);
    }


}
