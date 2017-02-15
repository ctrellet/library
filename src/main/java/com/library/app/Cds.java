package com.library.app;


import java.util.ArrayList;

/**
 * Created by christophe on 14/02/17.
 */
public class Cds implements LibraryInterface{


<<<<<<< HEAD
    private ArrayList<Cd> putItems(ArrayList<Cd> newCds ) {
        listCds.addAll(newCds);
        return listCds;
    };
=======
>>>>>>> ebb4678c23c52b28fb89acd034c5850973268561

    private ArrayList<Cd> listCds = new ArrayList<Cd>();

    public ArrayList<Cd> putItems(ArrayList newCds) {
        listCds.addAll(newCds);
        return listCds;
    }
}