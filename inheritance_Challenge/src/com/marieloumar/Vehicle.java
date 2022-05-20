package com.marieloumar;


// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.


public class Vehicle {
    private String name;
    private int gears;
    private double speed;
    private int steer;

    public Vehicle() {
        this ("Default name", 0, 0, 0);
    }

    public Vehicle(String name){
        this(name, 0, 0, 0);
    }

    public Vehicle(String name, int gears){
        this(name, gears, 0, 0);
    }

    public Vehicle(String name, int gears, int speed){
        this(name, gears, speed, 0);
    }

    public Vehicle(String name, int gears, double speed, int steer) {
        this.name = name;
        this.gears = gears;
        this.speed = speed;
        this.steer = steer;
    }

    public String getName() {
        return name;
    }

    public int getGears() {
        return gears;
    }

    public double getSpeed() {
        return speed;
    }

    public int getSteer() {
        return steer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setSteer(int steer) {
        this.steer = steer;
    }

    public void steer(int newSteer){
        setSteer(newSteer);
    }

    public void changeGear(int newGear){
        setGears(newGear);
    }

    public void changeSpeed(int newSpeed){
        setSpeed(getSpeed() - newSpeed);
    }
}
