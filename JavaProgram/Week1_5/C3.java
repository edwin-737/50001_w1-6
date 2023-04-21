package week2;

import week1.C2; // import C2 class
// import week1.C1; // Cannot import C1 because the class is default (package private). Not accessible from another package

// This C3 class is created to demonstrate the effect of public and default access modifier
public class C3 {
    public static void main(String[] args) {
        C2 c2 = new C2(); // both class and constructor are accessible by C3 here

    }
}
