package com.example.hsproject;


import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class MySharedPreference {
    private static SharedPreferences preContext = null;

    private static SharedPreferences getPreference(Context cx) {
        return PreferenceManager.getDefaultSharedPreferences(cx);
    }

    public static void register(Context cx, String username, String password) {
        setValue(cx, username, password);
    }

    public static void saveNames(Context cx, String username, String password) {
        setValue(cx, username, password);
    }

    public static String getStringValue(Context cx, String key) {
        if (preContext == null) {
            preContext = getPreference(cx);
        }

        return preContext.getString(key, "error");
    }

    private static void setValue(Context cx, String key, String val) {
        if (preContext == null) {
            preContext = getPreference(cx);
        }
        Editor ed = preContext.edit();
        ed.putString(key, val);
        boolean ret = ed.commit();
    }

    public static void saveCount(Context cx, String key, int count) {
        setValue(cx, key, count);
    }

    public static int getIntValue(Context cx, String key) {
        if (preContext == null) {
            preContext = getPreference(cx);
        }

        return preContext.getInt(key, 0);
    }

    private static void setValue(Context cx, String key, int val) {
        if (preContext == null) {
            preContext = getPreference(cx);
        }
        Editor ed = preContext.edit();
        ed.putInt(key, val);
        boolean ret = ed.commit();
    }
}

