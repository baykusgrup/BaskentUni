package com.baykusgrup.baskentuni.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by TAYİP on 1.1.2016.
 */
public class SharedPrefs {

    Activity activity;

    public String readJson(String saveName, Context context){
        SharedPreferences appSharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        String json = appSharedPrefs.getString(saveName, "");
        return json;
    }

    public  void storeJson(String saveName, String json, Context context){
        SharedPreferences appSharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = appSharedPrefs.edit();
        prefsEditor.putString(saveName, json);
        prefsEditor.commit();
    }
}
