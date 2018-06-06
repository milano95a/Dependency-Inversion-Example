package com.example.aj.dependency_inversion_example.following_dependency_inversion;

import android.util.Log;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        Log.wtf("LOG_Switchable", "Fan: Fan turned on...");
    }

    @Override
    public void turnOff() {
        Log.wtf("LOG_Switchable", "Fan: Fan turned off...");
    }
}