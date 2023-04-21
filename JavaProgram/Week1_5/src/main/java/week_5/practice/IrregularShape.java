package week_5.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class IrregularShape extends Rotatable implements Shape{
    IrregularShape(Integer[] sides){

        this.sides = new ArrayList<>(Arrays.asList(sides));
        this.noOfSides=this.sides.size();
    }
    @Override
    public int getArea() {
        return this.sides.get(0)*this.sides.get(1);
    }

    @Override
    void rotate(boolean clockwise) {
        System.out.println("Before rotation");
        for(int i = 0 ; i < noOfSides; i ++)
            System.out.println(i+" "+this.sides.get(i));

        int first = this.sides.get(0);
        int last=this.sides.get(noOfSides-1);
        System.out.println("here");
        if(clockwise) {
            for (int i = 0; i < noOfSides-1; i++) {
                this.sides.set(i, this.sides.get(i + 1));
            }
            this.sides.set(this.sides.size()-1, first);
        }
        else{
            for(int i = noOfSides-1 ; i >0 ; i --){
                this.sides.set(i,this.sides.get(i-1));
            }
            this.sides.set(0,last);

        }
        System.out.println("After rotation");
        for(int i = 0 ; i < noOfSides ; i ++)
            System.out.println(i+" "+this.sides.get(i));

    }
}
