package com.inheritance;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        setWidth(1.0);
        setLength(1.0);
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("Length can not be negative or zero");
        } else {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Width can not be negative or zero");
        } else {
            this.width = width;
        }
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of "
                + super.toString();
    }
}

