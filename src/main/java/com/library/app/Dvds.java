package com.library.app;

import java.util.ArrayList;

/**
 * Created by a on 15/02/17.
 */


public class Dvds {

    private ArrayList<Dvd> listDvds = new ArrayList<>();

    public ArrayList<Dvd> putItems(ArrayList newDvds){

        this.listDvds.addAll(newDvds);
        return listDvds;

    }


}
