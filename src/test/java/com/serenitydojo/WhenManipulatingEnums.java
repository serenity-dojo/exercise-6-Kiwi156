package com.serenitydojo;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.EnumMap;

public class WhenManipulatingEnums {
    static EnumMap<Level, String> LEVEL_LABELS = new EnumMap<>(Level.class);

    @Test
    public void withConditionals() {
        LEVEL_LABELS.put(Level.HIGH, "HIGH!");
        LEVEL_LABELS.put(Level.MEDIUM, "MEDIUM!");
        LEVEL_LABELS.put(Level.LOW, "LOW!");
        LEVEL_LABELS.put(Level.REALLY_LOW, "REALLYLOW!");

        Level mylevel = Level.HIGH;
        String LevelAsText = LEVEL_LABELS.get(mylevel);


        System.out.println(LevelAsText);
    }

    @Test
    public void whenUsingEnumAttributes() {
        System.out.println(Level.HIGH.getLevelCode());

    }

    @Test
    public void whenUsingEnumMoreAttributes() {

        Ladder ladder = new Ladder(10);
        comparableByHeightTo(ladder, 5);
        comparableByHeightTo(Level.HIGH, 3);
        System.out.println(Level.HIGH.isHighEnough(3));

    }

    public void comparableByHeightTo(ComparableByHeight thing, int minimumHeight) {
        if (thing.isHighEnough(minimumHeight)) {
            System.out.println("HIGH ENOUGH");
        } else {
            System.out.println("NOT HIGH ENOUGH!");

        }
    }
}