package week_5.practice;


public class TestIrregularShape {
    public static void main(String[] args) {
        Integer[] sides= {3,3,3};
        Integer[] sides1={3,3,2};
        IrregularShape equi_triangle = new IrregularShape(sides);
        IrregularShape isos_triangle = new IrregularShape(sides1);
        equi_triangle.rotate(true);
        isos_triangle.rotate(false);
    }
}
