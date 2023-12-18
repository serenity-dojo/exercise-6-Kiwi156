package com.serenitydojo;

public enum Level implements ComparableByHeight {
    HIGH(4),
    MEDIUM(3),
    LOW(2),
    REALLY_LOW(1);

    private final int levelCode;

    Level(int levelCode) {
        this.levelCode = levelCode;

    }
    public int getLevelCode(){
        return levelCode;
    }
    public boolean isHighEnough(int expectedLevel){
        return levelCode >= expectedLevel;
    }
}

