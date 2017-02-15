package com.library.app;

/**
 * Created by a on 15/02/17.
 */
public class Dvd {

    private String title;
    private int pages;
    private boolean troisd;
    private int time;
    private enum kind;


    public Book(String title, boolean troisd, int time, enum kind) {
        this.title = title;
        this.troisd = troisd;
        this.time = time;
        this.kind = kind;
    }


}
