package com.library.app;

/**
 * Created by a on 15/02/17.
 */
public enum Movie {

    HORROR( "Horror"   ),
    FUN(    "Fun"   ),
    ACTION( "Action"   ),
    MUSICAL("Musical"   );

    private String name = "";

    //Constructeur
    Movie(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

}
