package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println( myCompute(4, 1) );

        // Checked Exception
        try {
        FileReader fr = new FileReader("abc.txt");}
        catch (FileNotFoundException e) {
            System.out.println("You got " + e);
        }




    }

    public static int myCompute(int i, int j) {
        System.out.println(i/j);
        try {
            System.out.println("Try i/j");
            int y = i / j; // unchecked Exception
            int[] x = new int[3];
            System.out.println(x[4]); // unchecked Exception
//            return y;
        }
        catch (ArithmeticException ex) {
            System.out.println("you got: " + ex);
//            return 0;
        }
        finally {
            int z = 100;
            System.out.println("Clean Up");
            return 0;
        }

    }

}
