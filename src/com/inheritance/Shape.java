package com.inheritance;
public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.setColor("green");
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.setColor(color);
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //setFilled will flip the answer
    public void setFilled() {
        this.filled = !this.filled;
    }

    public String toString() {
        String condition = "A Shape with color of " + getColor();
        if (isFilled()) {
            condition +=" and filled";
        } else {
            condition +=" and not filled";
        }
        return condition;
    }

}
