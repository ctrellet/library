package com.library.app;

import java.util.ArrayList;

/**
 * Created by a on 15/02/17.
 */


public class Dvds {

    private final int MAX_DVDS = 3;

    private ArrayList<Dvd> listDvds = new ArrayList<>();

    public ArrayList<Dvd> putItems(ArrayList<Dvd> newDvds) {
        boolean okForAppend = true;
        if (this.listDvds.size() + newDvds.size() > MAX_DVDS){
            okForAppend = false;
        }else{
            if(listDvds.size()!=0) {
                for (Dvd newDvd : newDvds) {
                    if (listDvds.contains(newDvd)) {
                        okForAppend = false;
                    }
                }
            }
        }
        if(okForAppend) {
            this.listDvds.addAll(newDvds);
        }
        return listDvds;

    }


}
