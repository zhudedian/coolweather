package com.ider.coolweather.util;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by Eric on 2017/3/15.
 */

public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate(){
        context=getApplicationContext();
        LitePalApplication.initialize(context);

    }
    public static Context getContext(){
        return context;
    }
}
