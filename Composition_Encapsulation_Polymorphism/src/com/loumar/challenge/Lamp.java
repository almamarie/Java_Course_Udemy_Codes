package com.loumar.challenge;

public class Lamp {
    private String style;
    private boolean battery;
    private int blobRating;

    public Lamp(String style, boolean battery, int blobRating) {
        this.style = style;
        this.battery = battery;
        this.blobRating = blobRating;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getBlobRating() {
        return blobRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }
}
