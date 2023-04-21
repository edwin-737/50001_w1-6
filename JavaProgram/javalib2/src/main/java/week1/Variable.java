package week1;
//package lets jvm know that our package belongs to week 1 folder
import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
//Don't include package in voc submission
public class Variable {

    //public keyword means class is available to other classes
    //String is a type of expected input variable
    //args is variable
    public static void main(String[] args) {
        //static means that the attribute/method belongs to the class
        int a = 0;
        //arrays
        System.out.println("\n===arrays======-==");
        int c[];
        c= new int[3];
        c[0]=17;
        c[1]=21;
        c[2]=23;
        System.out.println("0th value: "+c[0]);
        //strings
        char[] dArray={'h','e','l','l','o'};
        String dString = new String(dArray);
        System.out.println(dString);
        //boolean
        System.out.println("\n===boolean===");
        boolean i=true;
        boolean j=false;
        System.out.println(i&&j);
        System.out.println(i||j);
        //double
        System.out.println("\n===double===");
        double x=0.3;
        double y=0.2;
        double z=x-y;
        System.out.println(Math.abs(z-0.1)==0);
        System.out.println(z);
        //Bigdecimal
        System.out.println("\n===BigDecimal===");
        BigDecimal xx=new BigDecimal("0.3");
        BigDecimal yy=new BigDecimal("0.2");
        BigDecimal zz=xx.subtract(yy);
        System.out.println(zz);
        System.out.println(zz.equals(new BigDecimal("0.1")));
    }
}
