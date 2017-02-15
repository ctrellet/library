package com.library.app;


import java.util.ArrayList;

/**
 * Created by christophe on 14/02/17.
 */
public class Cds {

    private ArrayList<Cd> listCds = new ArrayList<Cd>();

    private ArrayList<Cd> putItems(ArrayList<Cd> newCds ) {
        listCds.addAll(newCds);
        return listCds;
    };


}