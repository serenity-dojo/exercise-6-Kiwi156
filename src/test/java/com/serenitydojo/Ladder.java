package com.serenitydojo;

public class Ladder implements ComparableByHeight {


    private final int height;

    public Ladder(int height) {
        this.height = height;
    }

    @Override
    public boolean isHighEnough(int minimumAllowedHeight) {
        return false;
    }
}
