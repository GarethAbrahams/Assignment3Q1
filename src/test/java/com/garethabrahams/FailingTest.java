package com.garethabrahams;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FailingTest {

    @Test
    public void addDVD() {
        List MovieList = new ArrayList<DVD>();

        DVD movie = new DVD("Speed","Action");
        MovieList.add(movie);

        Assert.fail();
    }
}