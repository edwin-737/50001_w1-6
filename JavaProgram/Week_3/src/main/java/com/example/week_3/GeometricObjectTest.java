package week3;

import java.util.ArrayList;

public class GeometricObjectTest {
    public static void main(String[] args) {
        Circle c = new Circle(6, "Red");
        Rectangle r = new Rectangle();
        GeometricObject g = new GeometricObject();

        System.out.println();
        System.out.println( c.getColor() );
        System.out.println( r.getColor() );

        System.out.println();
        System.out.println(c.toString()); // invoke toString() from Circle class
        System.out.println(r.toString()); // invoke toString() from GeometricObject class because rectangle didnt ovveride toString()
        System.out.println(g.toString()); // invoke toString() from GeometricObject class

        System.out.println();
        System.out.println(Circle.getNumberOfObjects());
        System.out.println(Rectangle.getNumberOfObjects());
        System.out.println(GeometricObject.getNumberOfObjects());

        System.out.println();
        // it triggers the no-arg constructor of CustomCircle, which later trigger no-arg constructor
        // of Circle, which trigger no-arg constructor of GeometricObject
        CustomCircle cc = new CustomCircle();

        System.out.println( r.overlaps(r) ); // static polymorphism
        System.out.println( r.overlaps(c) );

        // Dynamic binding (polymorphism)
        ArrayList<AbstractGeometricObject> arr = new ArrayList<>();

        arr.add(c); // add circle object first
        arr.add(r);

        System.out.println("\n");
        for (AbstractGeometricObject tmp: arr)  {
            System.out.println( tmp.toString() ); // .toString() is dynamically bound to different class
            if (tmp instanceof Circle) {
                System.out.println("The radius is " + ((Circle) tmp).getRadius()); // downcasting is necessary here
            }
        }

    }

}
