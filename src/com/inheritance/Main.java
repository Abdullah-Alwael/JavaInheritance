package com.inheritance;
// deadline 7 PM;
public class Main {
    public static void main(String[] args) {
        // shape class test program:

        Shape circle = new Shape();
        Shape rectangle = new Shape("Blue", false);

        System.out.println(circle);
        System.out.println(rectangle);
        // make logic checks in setters

        System.out.println("Is the circle filled? "+circle.isFilled());
        System.out.println("Is the rectangle filled? "+rectangle.isFilled());
        System.out.println("The circle's color is "+circle.getColor());
        System.out.println("The rectangle's color is "+rectangle.getColor());
        circle.setColor("Yellow");
        rectangle.setColor("Purple");
        circle.setFilled(); // flips the previous condition.
        rectangle.setFilled();
        System.out.println("Is the circle filled? "+circle.isFilled());
        System.out.println("Is the rectangle filled? "+rectangle.isFilled());
        System.out.println("The circle's color is "+circle.getColor());
        System.out.println("The rectangle's color is "+rectangle.getColor());


    }
}
