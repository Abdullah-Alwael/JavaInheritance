package com.inheritance;

// deadline 7 PM;
public class Main {
    public static void main(String[] args) {
        // shape class test program:

        Shape circle = new Shape();
        Shape rectangle = new Shape("Blue", false);

        System.out.println(circle);
        System.out.println(rectangle);

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

        System.out.println("Circle 4's color is " + c4.getColor());
        c4.setColor("Brown");
        System.out.println("Circle 4's color changed to " + c4.getColor());

        System.out.println("Circle 5's filled? " + c5.isFilled());
        c5.setFilled();
        System.out.println("Circle 5's filled? changed to " + c5.isFilled());

        System.out.println(c5);

        // create 5 rectangles:

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.5, 9.6);
        Rectangle r3 = new Rectangle(6.1, 4.3, "Cyan", true);
        Rectangle r4 = new Rectangle(7.33, 8.2, "Turquoise", false);
        Rectangle r5 = new Rectangle(8.8, 3.4);

        System.out.println("Rectangle 1 has width of: " + r1.getWidth());
        System.out.println("Rectangle 1 has color of: " + r1.getColor());
        r1.setColor("lightBlue");
        System.out.println("Rectangle 1 has changed color to: " + r1.getColor());

        System.out.println("Rectangle 2 has length of: " + r2.getLength());
        System.out.println("Rectangle 2 is filled?: " + r2.isFilled());
        r2.setFilled();
        System.out.println("Rectangle 2 is filled? has changed to: " + r2.isFilled());

        System.out.println("Rectangle 3 has length of: " + r3.getLength());
        r3.setLength(-55); // can not be negative
        r3.setLength(0);// can not be zero
        r3.setLength(66.3);
        System.out.println("Rectangle 3 has changed length to: " + r3.getLength());

        System.out.println("Rectangle 4 has width of: " + r4.getWidth());
        r4.setWidth(-66); // can not be negative
        r4.setWidth(0); // can not be zero
        r4.setWidth(71.2);
        System.out.println("Rectangle 4 has changed width to: " + r4.getWidth());

        System.out.println("Rectangle 5 has area of: " + r5.getArea());
        System.out.println("Rectangle 5 has perimeter of: " + r5.getPerimeter());

        System.out.println(r5);

        // create 5 squares
        Square s1 = new Square();
        Square s2 = new Square(5);
        Square s3 = new Square(16);
        Square s4 = new Square(8, "red", true);
        Square s5 = new Square();

        System.out.println("Square 1 side size is: " + s1.getSide());
        s1.setSide(-11); // can not be negative
        s1.setSide(0); // can not be zero
        s1.setSide(12);
        System.out.println("Square 1 side changed size to: " + s1.getSide());
        System.out.println("Square's 1 color is " + s1.getColor());
        s1.setColor("PaleYellow");
        System.out.println("Square's 1 color changed to " + s1.getColor());

        System.out.println("Square 2 has width of: " + s2.getWidth());
        s2.setWidth(15);
        s2.setLength(15); // changed for consistency
        System.out.println("Square 2 has changed width to: " + s2.getWidth());
        System.out.println("Square 2 is filled? " + s2.isFilled());
        s2.setFilled();
        System.out.println("Square 2 is filled? changed to " + s2.isFilled());

        System.out.println("Square 3 has length of: " + s3.getLength());
        s3.setLength(11);
        s3.setWidth(11); // changed for consistency
        System.out.println("Square 3 has changed length to: " + s3.getLength());

        // following methods were not overridden: not needed
        System.out.println("Square 4's side is: " + s4.getSide());
        System.out.println("Square 4's area (rectangle's formula) is " + s4.getArea());
        System.out.println("Square 4's area manually calculated A=side*side = " + (s4.getSide() * s4.getSide()));

        System.out.println("Square 5's side is: " + s5.getSide());
        System.out.println("Square 5's perimeter (rectangle's formula) is " + s5.getPerimeter());
        System.out.println("Square 5's perimeter calculated manually  is P=4*side = " + (4 * s5.getSide()));
        System.out.println(s5);
    }
}
