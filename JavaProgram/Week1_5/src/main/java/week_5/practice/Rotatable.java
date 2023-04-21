package week_5.practice;

import java.util.ArrayList;

public abstract class Rotatable {
    ArrayList<Integer>sides=new ArrayList<>();
    int noOfSides=0;
    abstract void rotate(boolean clockwise);
}
