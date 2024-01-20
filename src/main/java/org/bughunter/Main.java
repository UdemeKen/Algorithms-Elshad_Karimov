package org.bughunter;

import org.bughunter.arrayCodingExercises_Leetcode.BestScore;
import org.bughunter.arrayCodingExercises_Leetcode.DiagonalElements;
import org.bughunter.arrayCodingExercises_Leetcode.MiddleArray;
import org.bughunter.arrays.SingleDimensionArray;
import org.bughunter.arrays.averageTemperature.AverageTemperature;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        BestScore bestScore = new BestScore();
        System.out.println(Arrays.toString(bestScore.calculateTopTwoScores(myArray)));
    }
}