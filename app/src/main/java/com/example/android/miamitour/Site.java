package com.example.android.miamitour;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Site {
    public String mName;
    public String mDescription;
    public String mAddress;
    public float mLatitude;
    public float mLongitude;
    public int mImageResourceId;

    public Site(String name, int imageResourceId) {
        mName = name;
        mImageResourceId = imageResourceId;
    }

    public Site(String name, String address, String description) {
        mName = name;
        mAddress = address;
        mDescription = description;
    }

    public Site(String name, String description, float longitude, float latitude, int imageResourceId) {
        mName = name;
        mDescription = description;
        mLatitude = latitude;
        mLongitude = longitude;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getDescription() {
        return mDescription;
    }

}
