package week3;

public class Circle extends AbstractGeometricObject{
    private double radius = 0.0; // add new attribute
    private static int numberOfObjects = 0; // new static attribute. it doesnt ovveride the parent static attribute

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    @Override
    public double getArea() {  // implement the abstract method.
        return Math.PI * Math.pow(radius, 2);
    }

    Circle() {  // constructor
        // by default, super() is implicitly invoked first.
        System.out.println("Circle No-arg constructor");
        radius = 1.0;
        numberOfObjects += 1;
    }

    Circle(double newRadius) {
        System.out.println("Circle Constructor with argument");
        radius = newRadius;
        numberOfObjects += 1;

    }

    Circle(double newRadius, String color) {
        super(color); // invoke parent class constructor with argument. must be explicit
        System.out.println("Circle Constructor with argument");
        radius = newRadius;
        numberOfObjects += 1;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "This is a circle with radius " + radius;
    }

}
