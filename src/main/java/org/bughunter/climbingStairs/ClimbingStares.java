package org.bughunter.climbingStairs;

/*
Problem:
    Climbing Stairs
    You are climbing a staircase. It takes n steps to reach to the top.
    Each time you can either climb 1 or 2 steps.
    In how many distinct ways can you climb to the top?

Framework for solving DP Problems:
    1. Define the objective function
        f(i) is the number of distinct ways to reach the i-th stair.

    2. Identify base cases
        f(0) = 1
        f(1) = 1

    3. Write down a recurrence relation for the optimized objective function
        f(n) = f(n - 1) + f(n - 2)

    4. What's the order of execution?
        bottom-up approach

    5. Where to look for the answer?
        f(n)
* */

public class ClimbingStares {

    public int calculateClimbStares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
