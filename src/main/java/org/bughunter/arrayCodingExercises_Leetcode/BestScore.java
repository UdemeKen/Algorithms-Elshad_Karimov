package org.bughunter.arrayCodingExercises_Leetcode;

import java.util.HashSet;
import java.util.Set;

public class BestScore {

    public static int[] calculateTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else  if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }
        return new int[]{firstHighest, secondHighest};
    }
}
