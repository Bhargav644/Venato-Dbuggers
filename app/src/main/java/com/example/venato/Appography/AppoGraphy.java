package com.example.venato.Appography;

import android.graphics.drawable.Drawable;

public class AppoGraphy {
    Drawable appIcon;
    String appName, packageName, category;
    long timeInForeground;
    int launchCount;



    AppoGraphy(String pName) {
        this.packageName = pName;
    }

    void setAppName(String aName){
        this.appName = aName;
    }

    void setAppIcon(Drawable aIcon){
        this.appIcon = aIcon;
    }

    void setCategory(String _cat) { this.category = _cat; }

    public long getTimeInForeground(){ return this.timeInForeground; }
    public String getAppName(){ return this.appName; }
}