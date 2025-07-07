package com.inheritance;

public class Square extends Rectangle {
    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.out.println("Side can not be negative or zero");
        } else {
            super.setWidth(side);
            super.setLength(side);
        }
    }

    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
    //TODO: P = 4*side, but maybe it calculates it correctly?
    // The perimeter of square is different than a rectangle

    //TODO: A = side*side, but maybe the calculation is correct?
    // the area of a square is different than a rectangle
}
