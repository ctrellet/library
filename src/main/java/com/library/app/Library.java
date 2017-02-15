package com.library.app;

import java.util.ArrayList;

/**
 * Created by a on 15/02/17.
 */
public class Library {

    private String title;
    private boolean TroisD;

    private Books books = new Books();
    private Cds cds = new Cds();
    private Dvds dvds = new Dvds();

    private final int OPEN_HOUR = 13;
    private final int CLOSE_HOUR = 19;
    protected final int MAX_DVDS = 3;


    public boolean isOpen(int hour){
        return (OPEN_HOUR<=hour)&&(hour<=CLOSE_HOUR)
    }

    public ArrayList<Book> putBooks(ArrayList<Book> books){


    };

    public ArrayList<Book> putCDs(ArrayList<Book> newBooks){
        return this.books.putItems(newBooks);
    };
    public ArrayList<Cd> putCDs(ArrayList<Cd> newCds){
        return this.cds.putItems(newCds);
    };
    public ArrayList<Dvd> putDvds(ArrayList<Dvd> newDvds){
        return this.dvds.putItems(newDvds);
    };
}