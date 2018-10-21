package com.iesemilidarder.maviles.data;

public class Submarine extends WaterCraft implements IdDive{

    public void goDeeper() {
    }

    public void goSurface() {
    }

    public void doFloat() {
        super.doFloat();
        System.out.println("Floto, pero tambien me piro!");
    }

}
