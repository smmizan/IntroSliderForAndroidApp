package com.smmizan.introsliderforandroidapp;

import android.content.Context;
import android.content.SharedPreferences;

public class MyPreference {
    private static SharedPreferences pref;

    // Shared preferences file name
    private static final String PREF_NAME = "my_shared_pref";

    private static final String LAUNCH_TIME = "launch";

    public static void init(Context context) {
        pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public static boolean shouldShowSlider() {
        return (pref == null) || pref.getBoolean(LAUNCH_TIME, true);
    }

    public static void saveFirstTimeLaunch(boolean isFirstTime) {
        if (pref == null)
            return;

        SharedPreferences.Editor editor = pref.edit();
        if (editor != null) {
            editor.putBoolean(LAUNCH_TIME, isFirstTime);
            editor.apply();
        }
    }
}
