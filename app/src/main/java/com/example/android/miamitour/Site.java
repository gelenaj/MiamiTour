package com.example.android.miamitour;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Site implements Serializable {
    public String mName;
    public String mDescription;
    public float mLatitude;
    public float mLongitude;
    public int mImageResourceId;

    public Site(String name, int imageResourceId) {
        mName = name;
        mImageResourceId = imageResourceId;
    }

//   public Site() {
//        mName = name;
//    }

    public Site(String name, String description) {
        mName = name;
        mDescription = description;
    }

    public Site(String name,String description, float longitude, float latitude, int imageResourceId) {
        mName = name;
        mDescription = description;
        mLatitude = latitude;
        mLongitude = longitude;
        mImageResourceId = imageResourceId;
    }

    public String getName(){return mName;}

    public String getDescription(){return mDescription;}

    public float getmLatitude(){return mLatitude;}

    public float getmLongitude(){return mLongitude;}

    public int getmImageResourceId(){return mImageResourceId;}
}
