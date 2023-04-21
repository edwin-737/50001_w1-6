package com.example.week_3.modifier2;

import week3.modifier1.SortingAlgorithm;

public class BetterSortingAlgorithm extends SortingAlgorithm {
    public static void main(String[] args) {
        BetterSortingAlgorithm x = new BetterSortingAlgorithm();

        System.out.println(x.sort());
    }

    @Override
    public String sortAlgorithm() { // cannot weaken the modifier. but can strengthen it
        return "Merge Sort";
    }

}
