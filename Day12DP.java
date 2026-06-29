import java.util.Arrays;

public class Day12DP {

    // ---------------- Fibonacci ----------------

    // Recursion
    public static int recursionFib(int n) {

        if(n <= 1) {
            return n;
        }

        return recursionFib(n - 1) + recursionFib(n - 2);
    }

    // Memoization (Top Down)
    public static int memoizationFib(int n, int[] dp) {

        if(n <= 1) {
            return n;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        dp[n] = memoizationFib(n - 1, dp)
              + memoizationFib(n - 2, dp);

        return dp[n];
    }

    // Tabulation (Bottom Up)
    public static int tabulationFib(int n, int[] dp) {

        if(n <= 1) {
            return n;
        }

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    // Space Optimized
    public static int spaceOptimizationFib(int n) {

        if(n <= 1) {
            return n;
        }

        int prev2 = 0;
        int prev1 = 1;

        for(int i = 2; i <= n; i++) {

            int current = prev1 + prev2;

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    // ---------------- Factorial ----------------

    public static int factorialTabulationDP(int n, int[] dp) {

        dp[0] = 1;

        for(int i = 1; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }

        return dp[n];
    }

    // ---------------- 0/1 Knapsack ----------------

    public static int knapsack(int[] weights,
                               int[] values,
                               int capacity) {

        int[] dp = new int[capacity + 1];

        for(int i = 0; i < weights.length; i++) {

            for(int w = capacity; w >= weights[i]; w--) {

                dp[w] = Math.max(dp[w],
                                 values[i] + dp[w - weights[i]]);
            }
        }

        return dp[capacity];
    }

    public static void main(String[] args) {

        int n = 5;

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        System.out.println("Recursion          : " + recursionFib(n));

        System.out.println("Memoization        : "
                + memoizationFib(n, dp));

        Arrays.fill(dp, 0);

        System.out.println("Tabulation         : "
                + tabulationFib(n, dp));

        System.out.println("Space Optimization : "
                + spaceOptimizationFib(n));

        Arrays.fill(dp, 0);

        System.out.println("Factorial          : "
                + factorialTabulationDP(n, dp));

        // Knapsack Example

        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};
        int capacity = 7;

        System.out.println("Knapsack           : "
                + knapsack(weights, values, capacity));
    }
}