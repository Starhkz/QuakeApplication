package com.example.quakeapplication;

public class Quake {
    private String mdate;
    private String mplace;
    private double mMag;
    public  Quake(double Mag, String place, String date){
        mdate=date;
        mplace=place;
        mMag=Mag;
    }
    public String getdate () {
        return mdate;
    }
    public String getplace () {
        return mplace;
    }
    public double getMag () {
        return mMag;
    }
}
