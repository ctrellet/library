package com.library.app;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests unitaires de la librairie
 */
public class LibraryTest {

    // Test de non ouverture du magasin à 12 h => NON
    @Test
    public void isOpenAt12() {

        //set
        Library myLib = new Library();

        //assert
        assertTrue(!myLib.isOpen(12));
    }

    // Test d'ouverture du magasin à 13 h => OUI
    @Test
    public void isOpenAt13() {

        //set
        Library myLib = new Library();

        //assert
        assertTrue(myLib.isOpen(13));
    }

    // Test d'ouverture du magasin à 19 h => OUI
    @Test
    public void isOpenAt19() {

        //set
        Library myLib = new Library();

        //assert
        assertTrue(myLib.isOpen(19));
    }

    // Test de non ouverture du magasin à 20 h =>  NON
    @Test
    public void isOpenAt20() {

        //set
        Library myLib = new Library();

        //assert
        assertTrue(!myLib.isOpen(20));
    }



    // Peut-on ajouter des livres => OUI
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

    // Peut-on ajouter des CDs => OUI
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

    // Peut-on ajouter des DVDs => OUI
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

    // Peut-on ajouter "beaucoups" de livres => OUI
    @Test
    public void ManyBooksTest() {

        //set
        Book book1, book2, book3, book4, book5;
        ArrayList<Book> myBooks = new ArrayList<Book>();
        book1 = new Book("Book1",10);
        book2 = new Book("Book2",20);
        book3 = new Book("Book3",30);
        book4 = new Book("Book4",40);
        book5 = new Book("Book5",50);
        myBooks.add(book1);
        myBooks.add(book2);
        myBooks.add(book3);
        myBooks.add(book4);
        myBooks.add(book5);
        book1 = new Book("Book6",10);
        book2 = new Book("Book7",20);
        book3 = new Book("Book8",30);
        book4 = new Book("Book9",40);
        book5 = new Book("Book10",50);
        myBooks.add(book1);
        myBooks.add(book2);
        myBooks.add(book3);
        myBooks.add(book4);
        myBooks.add(book5);

        Library myLib = new Library();

        //test
        ArrayList<Book> finalList = myLib.putBooks(myBooks);
        int listSize =  finalList.size();

        //assert
        assertEquals(10,listSize);
    }


    // Peut-on ajouter un lot de DVDs qui ferait "déborder" le stock => NON
    @Test
    public void toMuchDvdTest() {

        //set
        Dvd dvd1,dvd2;
        ArrayList<Dvd> myDvdsList1, myDvdsList2, finalList;

        dvd1 = new Dvd("Dvd1",10, true, Movie.ACTION);
        dvd2 = new Dvd("Dvd2",20, false, Movie.FUN);
        myDvdsList1 = new ArrayList<Dvd>();
        myDvdsList1.add(dvd1);
        myDvdsList1.add(dvd2);

        dvd1 = new Dvd("Dvd3",30, true, Movie.HORROR);
        dvd2 = new Dvd("Dvd4",40, false, Movie.MUSICAL);
        myDvdsList2 = new ArrayList<Dvd>();
        myDvdsList2.add(dvd1);
        myDvdsList2.add(dvd2);

        Library myLib = new Library();

        //test
        finalList = myLib.putDvds(myDvdsList1);
        finalList = myLib.putDvds(myDvdsList2);
        int listSize =  finalList.size();

        //assert
        assertEquals(2,listSize);
    }

    // Peut-on ajouter un lot de DVDs qui dont l'un est déjà en stock  => NON
    @Test
    public void duplicateDvdInFinalListTest() {

        //set
        Dvd dvd1,dvd2,dvd3;
        ArrayList<Dvd> myDvdsList1, myDvdsList2, finalList;

        dvd1 = new Dvd("Dvd1",10, true, Movie.ACTION);
        myDvdsList1 = new ArrayList<Dvd>();
        myDvdsList1.add(dvd1);

        dvd2 = new Dvd("Dvd2",30, true, Movie.HORROR);
        dvd3 = new Dvd("DVD1",20, true, Movie.FUN);
        myDvdsList2 = new ArrayList<Dvd>();
        myDvdsList2.add(dvd2);
        myDvdsList2.add(dvd3);

        Library myLib = new Library();

        //test
        finalList = myLib.putDvds(myDvdsList1);
        finalList = myLib.putDvds(myDvdsList2);
        int listSize =  finalList.size();

        //assert
        assertEquals(1,listSize);
    }

    // Peut-on ajouter un lot de DVDs qui dont l'un est déjà en stock  => NON
    @Test
    public void duplicateDvdInImportedListTest() {

        //set
        Dvd dvd1,dvd2,dvd3;
        ArrayList<Dvd> myDvdsList1, myDvdsList2, finalList;

        dvd1 = new Dvd("Dvd1",10, true, Movie.ACTION);
        myDvdsList1 = new ArrayList<Dvd>();
        myDvdsList1.add(dvd1);

        dvd2 = new Dvd("Dvd2",20, true, Movie.FUN);
        dvd3 = new Dvd("Dvd2",30, true, Movie.HORROR);
        myDvdsList2 = new ArrayList<Dvd>();
        myDvdsList2.add(dvd2);
        myDvdsList2.add(dvd3);

        Library myLib = new Library();

        //test
        finalList = myLib.putDvds(myDvdsList1);
        finalList = myLib.putDvds(myDvdsList2);
        int listSize =  finalList.size();

        //assert
        assertEquals(1,listSize);
    }

    // Peut-on ajouter un lot de DVDs différents => OUI
    @Test
    public void noDuplicateDvdTest() {

        //set
        Dvd dvd1,dvd2,dvd3;
        ArrayList<Dvd> myDvdsList1, myDvdsList2, finalList;

        dvd1 = new Dvd("Dvd1",10, true, Movie.ACTION);
        myDvdsList1 = new ArrayList<Dvd>();
        myDvdsList1.add(dvd1);

        dvd2 = new Dvd("Dvd2",30, true, Movie.HORROR);
        dvd3 = new Dvd("Dvd3",20, true, Movie.MUSICAL);
        myDvdsList2 = new ArrayList<Dvd>();
        myDvdsList2.add(dvd2);
        myDvdsList2.add(dvd3);

        Library myLib = new Library();

        //test
        finalList = myLib.putDvds(myDvdsList1);
        finalList = myLib.putDvds(myDvdsList2);
        int listSize =  finalList.size();

        //assert
        assertEquals(3,listSize);
    }

}
