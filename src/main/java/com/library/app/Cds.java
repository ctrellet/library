package com.library.app;

import java.util.ArrayList;

/**
 * Created by christophe on 14/02/17.
 */

public class Cds implements LibraryInterface{


    private ArrayList<Cd> listCds = new ArrayList<Cd>();

    public ArrayList<Cd> putItems(ArrayList newCds) {
        listCds.addAll(newCds);
        return listCds;
    }
}