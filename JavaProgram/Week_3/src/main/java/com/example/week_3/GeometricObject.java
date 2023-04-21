package week3;

public class GeometricObject {
    private String color = "White";
    private static int numberOfObjects = 0;

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        GeometricObject.numberOfObjects = numberOfObjects;
    }

    GeometricObject() {  // no-arg constructor
        System.out.println("\nGeometric Object no-arg Constructor");
        setNumberOfObjects( getNumberOfObjects()+1 );
    }

    GeometricObject(String color) {  // no-arg constructor
        this.color = color;
        System.out.println("\nGeometric Object Constructor with Argument");
        setNumberOfObjects( getNumberOfObjects()+1 );

    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "This is a geometric object";
    }

}
