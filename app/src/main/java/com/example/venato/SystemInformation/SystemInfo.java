package com.example.venato.SystemInformation;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class SystemInfo {
    Context context;

    public SystemInfo(Context _context){
        context=_context;
    }
    public String getSystemId(){
        return Build.ID;
    }
    public String getSystemBrand(){
        return Build.BRAND;
    }
    public String getSystemIncremental(){
        return Build.VERSION.INCREMENTAL;
    }
    public String getCurrentSdk(){
        return Build.VERSION.SDK;
    }

}
