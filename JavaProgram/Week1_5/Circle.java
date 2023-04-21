package week2;

public class Circle {
    private double radius;   // data field called radius is created
    static int numberOfCircles = 0;

    private String color = "White";
    public String getColor() {
        return color;
    }

    Circle() {  // constructor
        System.out.println("\nNo-arg constructor is invoked");
        radius = 1.0;
        numberOfCircles += 1;
    }

    Circle(double newRadius) {
        System.out.println("\nConstructor with argument");
        radius = newRadius;
        numberOfCircles += 1;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double newRadius) {
        if (newRadius >= 0) {
            radius = newRadius;
        }
        else {
            System.out.println("Radius is invalid");
            radius = 1.0;
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(Circle.numberOfCircles);
    }
}
