package com.example.aj.dependency_inversion_example.following_dependency_inversion.test;

import com.example.aj.dependency_inversion_example.following_dependency_inversion.ElectricPowerSwitch;
import com.example.aj.dependency_inversion_example.following_dependency_inversion.Fan;
import com.example.aj.dependency_inversion_example.following_dependency_inversion.LightBulb;
import com.example.aj.dependency_inversion_example.following_dependency_inversion.Switch;
import com.example.aj.dependency_inversion_example.following_dependency_inversion.Switchable;

public class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception {
        Switchable switchableBulb=new LightBulb();
        Switch bulbPowerSwitch=new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan=new Fan();
        Switch fanPowerSwitch=new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}
