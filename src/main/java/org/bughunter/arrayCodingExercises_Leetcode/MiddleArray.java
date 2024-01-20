package org.bughunter.arrayCodingExercises_Leetcode;

public class MiddleArray {

    public static int[] returnMiddleArray(int[] array) {
        if (array.length <= 2) {
            return new int[0];
        }
        int[] middleArray = new int[array.length - 2];
        for (int i = 1; i < array.length - 1; i++) {
            middleArray[i - 1] = array[i];
        }
        return middleArray;
    }
}
