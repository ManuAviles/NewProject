package com.iesemilidarder.maviles.data;

public abstract class Vehicle {

    private double price;
    private int numWheels;
    private String color;

    protected void doLog(String message) {
    System.out.print(message);
}

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void brake() {
    }
}
