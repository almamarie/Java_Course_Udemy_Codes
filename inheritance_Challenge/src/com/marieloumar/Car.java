package com.marieloumar;

public class Car extends Vehicle{
    private String brand;
    private String name;
    private int wheels;
    private int doors;

    public Car(String brand, String name, int wheels, int doors) {
        this.brand = brand;
        this.name = name;
        this.wheels = wheels;
        this.doors = doors;
    }

    public Car(String name, String brand, String name1, int wheels, int doors) {
        super(name);
        this.brand = brand;
        this.name = name1;
        this.wheels = wheels;
        this.doors = doors;
    }

    public Car(String name, int gears, String brand, String name1, int wheels, int doors) {
        super(name, gears);
        this.brand = brand;
        this.name = name1;
        this.wheels = wheels;
        this.doors = doors;
    }

    public Car(String name, int gears, int speed, String brand, String name1, int wheels, int doors) {
        super(name, gears, speed);
        this.brand = brand;
        this.name = name1;
        this.wheels = wheels;
        this.doors = doors;
    }

    public Car(String name, int gears, double speed, int steer, String brand, String name1, int wheels, int doors) {
        super(name, gears, speed, steer);
        this.brand = brand;
        this.name = name1;
        this.wheels = wheels;
        this.doors = doors;
    }



}
