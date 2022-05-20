package com.marieloumar;

public class Main {

    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC pc = new PC(theCase, monitor, motherboard);

        System.out.println(pc.getMotherboard().getBios());
        pc.getMonitor().drawPixelAt(8, 10, "Yellow");
        pc.getMotherboard().loadProgram("Ubuntu 20.04");
        pc.getTheCase().pressPowerButton();
    }
}
