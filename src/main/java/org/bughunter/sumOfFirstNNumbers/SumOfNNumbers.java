package org.bughunter.sumOfFirstNNumbers;

/*
    Problem:
    Find the sum of the first N numbers.

    Objective Function:
    f(i) id the sum of the first i elements.

    Recurrence relation:
    f(n) = f(n - 1) + n
* */

public class SumOfNNumbers {

    public int nSum(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for(int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + i;
        }
        return dp[n];
    }
}
