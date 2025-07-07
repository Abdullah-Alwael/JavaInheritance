package com.inheritance;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        setRadius(1.0);
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    //TODO check for valid inputs
    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("Radius can not be negative or zero");
        } else {
            this.radius = radius;
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }
}
