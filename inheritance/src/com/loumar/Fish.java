package com.loumar;

public class Fish extends Animal{

    private int gills;
    private int fins;
    private int tail;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int fins, int tail) {
        super(name, 1, 1, size, weight);
        this.fins = fins;
        this.tail = tail;
        this.gills = gills;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private  void  swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    private void sleep(){

    }
}
