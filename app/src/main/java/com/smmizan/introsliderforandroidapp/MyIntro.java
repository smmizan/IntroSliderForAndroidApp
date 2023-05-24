package com.smmizan.introsliderforandroidapp;

import android.app.Application;

public class MyIntro extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        MyPreference.init(this);
    }
}
