package com.example.aj.dependency_inversion_example.not_following_dependency_inversion;

import android.util.Log;

public class LightBulb {
    public void turnOn() {
        Log.wtf("LOG_LightBulb", "LightBulb: Bulb turned on...");
    }
    public void turnOff() {
        Log.wtf("LOG_LightBulb", "LightBulb: Bulb turned off...");
    }
}