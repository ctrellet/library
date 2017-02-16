package com.library.app;

/**
 * Created by a on 15/02/17.
 */
public class Dvd {

    private String title;
    private int duration;
    private boolean troisd;
    private Movie kind;


    public Dvd(String title, int duration, boolean troisd, Movie kind) {
        this.title = title;
        this.duration = duration;
        this.troisd = troisd;
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        // La comparaison des DVD ne se fait que sur le titre en majuscule
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dvd dvd = (Dvd) o;

        return title.toUpperCase().equals(dvd.title.toUpperCase());
    }

}
