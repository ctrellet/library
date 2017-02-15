package com.library.app;

/**
 * Created by a on 15/02/17.
 */
public enum Kind {

    horror( "Horror"   ),
    fun(    "Fun"   ),
    action( "Action"   ),
    musical("Musical"   );

    private String name = "";

    //Constructeur
    Kind(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

}
