package com.example.aj.dependency_inversion_example.following_dependency_inversion;

import android.util.Log;

public class LightBulb implements Switchable {

    @Override
    public void turnOn() {
        Log.wtf("LOG_LightBulb", "LightBulb: Bulb turned on...");
    }

    @Override
    public void turnOff() {
        Log.wtf("LOG_LightBulb", "LightBulb: Bulb turned off...");
    }
}
