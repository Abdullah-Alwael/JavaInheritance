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

        System.out.println("Is the circle filled? " + circle.isFilled());
        System.out.println("Is the rectangle filled? " + rectangle.isFilled());
        System.out.println("The circle's color is " + circle.getColor());
        System.out.println("The rectangle's color is " + rectangle.getColor());
        circle.setColor("Yellow");
        rectangle.setColor("Purple");
        circle.setFilled(); // flips the previous condition.
        rectangle.setFilled();
        System.out.println("Is the circle filled? " + circle.isFilled());
        System.out.println("Is the rectangle filled? " + rectangle.isFilled());
        System.out.println("The circle's color is " + circle.getColor());
        System.out.println("The rectangle's color is " + rectangle.getColor());


        // --------------------------------------------------------------------
        // create 5 circles:
        Circle c1 = new Circle();
        Circle c2 = new Circle(7.5);
        Circle c3 = new Circle(5.5, "orange", true);
        Circle c4 = new Circle(15.7, "white", true);
        Circle c5 = new Circle(2.95, "black", true);

        c1.setRadius(-110); // error message, can not set negative
        c1.setRadius(0); // radius can not be zero
        System.out.println("Circle 1's radius is: " + c1.getRadius());
        c1.setRadius(8.6); // no errors
        System.out.println("Circle 1's radius changed to: " + c1.getRadius());

        System.out.println("Circle 2's Area is: " + c2.getArea());

        System.out.println("Circle 3's perimeter is: " + c3.getPerimeter());

        System.out.println(c4);
        System.out.println(c5);

    }
}
