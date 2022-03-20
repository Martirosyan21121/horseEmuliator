package com.epam.beans;

public class Horse {

    private String bread;
    private int raceNumber;
    private String riderName;

    public Horse(String bread, int raceNumber, String riderName) {
        this.bread = bread;
        this.raceNumber = raceNumber;
        this.riderName = riderName;
    }

    public String getBread() {
        return bread;
    }

    public int getRaceNumber() {
        return raceNumber;
    }

    public String getRiderName() {
        return riderName;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "bread='" + bread + '\'' +
                ", raceNumber=" + raceNumber +
                ", riderName='" + riderName + '\'' +
                '}';
    }
}
