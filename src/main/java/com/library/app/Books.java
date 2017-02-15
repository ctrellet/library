package com.library.app;

import java.util.ArrayList;

/**
 * Created by a on 14/02/17.
 */

public class Books  implements LibraryInterface{


    private ArrayList<Book> listBooks = new ArrayList<Book>();

    public ArrayList<Book> putItems(ArrayList  newBooks){

        this.listBooks.addAll(newBooks);
        return listBooks;


    }




}
