package org.bughunter;

import org.bughunter.arrays.SingleDimensionArray;

public class Main {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 0);
        sda.insert(1, 10);
        sda.insert(2, 20);
//        sda.insert(1, 30);
//        sda.insert(12, 120);
//
//        sda.searchInArray(30);
        sda.deleteValue(1);
    }
}