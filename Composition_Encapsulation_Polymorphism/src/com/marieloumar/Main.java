package com.marieloumar;

import com.loumar.challenge.*;

public class Main {

    public static void main(String[] args){

        String name = "Master Bedroom";
        Wall wall1 = new Wall("left");
        Wall wall2 = new Wall("right");
        Wall wall3 = new Wall("back");
        Wall wall4 = new Wall("front");
        Ceiling ceiling = new Ceiling(7, 7896);
        Bed bed = new Bed("Neat", 4, 9, 4, 9);
        Lamp lamp = new Lamp("Classic", true, 90);

        Bedroom bedroom = new Bedroom(name, wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        System.out.println(bedroom.getLamp().getStyle());
        bedroom.makeBed();
        bedroom.getLamp().turnOn();


    }
}
