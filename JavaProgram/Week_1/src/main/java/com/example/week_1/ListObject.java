package com.example.week_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListObject {
    public static void main(String[] args) {
//        ArrayList<String> arr = new ArrayList<String>();
        LinkedList<String> arr = new LinkedList<>();

        // add/insert
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add(0, "Java");
        System.out.println(arr);

        // access
        System.out.println( arr.get(0) );

        // set
        arr.set(0, "Python");
        System.out.println(arr);

        // search
        System.out.println(arr.indexOf("A"));

        // remove
        arr.remove("Python");
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);

    }
}
