package org.bughunter.arrayCodingExercises_Leetcode;

public class DiagonalElements {

    public static int calculateDiagonalElement(int[][] array) {
        int sum = 0;
        int numRows = array.length;

        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }
}
