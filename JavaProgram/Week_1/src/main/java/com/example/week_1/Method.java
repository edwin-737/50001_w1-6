package com.example.week_1;


public class Method {
    // static --> class method
    public static void main(String[] args) {
        printNTimes( "Jia You", 10 );

        Method m = new Method(); //Create object from Method class
        m.printNTimes("Hoho", 3);

        System.out.println( getNumber() );

        System.out.println( compareTwoThings(true, false));
    }

    static void printNTimes( String s, int n ){
        for (int i = 0; i<n; i++){
            System.out.println(s);
        }
    }

    static int getNumber() {
        return 5;
    }

    // access_keyword static_keyword datatype function_name(parameters)
    public static boolean compareTwoThings(boolean a, boolean b){
        return a == b;
    }



}
