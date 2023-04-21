package week3;

public class Rectangle extends AbstractGeometricObject {
    private double height = 0.0;
    private double weight = 0.0;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getArea(){
        return getHeight() * getWeight();
    }

    private static int numberOfObjects = 0; // new static attribute. it doesnt ovveride the parent static attribute

    Rectangle() {  // implicitly invoke super()
        numberOfObjects += 1;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // Method overloading: same method name, different parameters
    public String overlaps(Rectangle r) {
        return "Overlaps with Rectangle object";
    }

    public String overlaps(Circle r) {   // method overloading
        return "Overlaps with Circle object";
    }

}
