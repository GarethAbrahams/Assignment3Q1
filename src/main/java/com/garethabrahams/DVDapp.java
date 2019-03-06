package com.garethabrahams;

import java.util.ArrayList;
import java.util.List;

public class DVDapp {

    List MovieList = new ArrayList<DVD>();

    public void addDVD(){
        DVD movie = new DVD("Speed","Action");
        MovieList.add(movie);
    }

}
