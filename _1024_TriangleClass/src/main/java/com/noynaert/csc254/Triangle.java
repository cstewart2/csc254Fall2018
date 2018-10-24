package com.noynaert.csc254;

public class Triangle {
    private double base;
    private double height;

    //Constructors
    public Triangle(double base, double height){
        setBase(base);
        setHeight(height);
    }
    public Triangle(double side){
        this(side, side);
    }
    public Triangle(){
        this(1.0,1.0);
    }

    //Setters
    public void setBase(double base){
        this.base = (base <= 0.0) ? 1.0 : base;
        check();

    }

    public void setHeight(double height) {
        this.height = height <=0 ? 1.0 : height;
        check();
    }
    //Getters
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }

    public String toString() {
        String result = String.format("Base: %f, Height: %f, Area: %f",
                base, height, getArea());
        return result;
    }
    private void check(){
        if(base < height){
            double temp = base;
            base = height;
            height = temp;
        }
    }
    public double getArea(){
        return base * height * 0.5;
    }
}
