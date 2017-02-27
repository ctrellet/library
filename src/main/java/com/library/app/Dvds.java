package com.library.app;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by a on 15/02/17.
 */


public class Dvds {

    private final int MAX_DVDS = 3;

    private ArrayList<Dvd> listDvds = new ArrayList<>();

    public ArrayList<Dvd> putItems(ArrayList<Dvd> newDvds) {
        boolean okForAppend = true;
        HashSet<Dvd> globalListOfUniqueDvds = new HashSet<>();

        if (newDvds.size()==0||(this.listDvds.size() + newDvds.size() > MAX_DVDS)){
            okForAppend = false;
        }else{
            if(listDvds.size()!=0) {
                ArrayList<Dvd> uniqueDvdInImportedList = new ArrayList<Dvd>();
                for (Dvd newDvd : newDvds) {

                    // On test si le dvd à ajouter est en doublon dans la liste à importer
                    if (uniqueDvdInImportedList.contains(newDvd)) {
                        okForAppend = false;
                        break;
                    }
                    uniqueDvdInImportedList.add(newDvd);

                    // On test si le dvd à ajouter est en doublon dans la liste existante
                    if (listDvds.contains(newDvd)) {
                        okForAppend = false;
                        break;
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
