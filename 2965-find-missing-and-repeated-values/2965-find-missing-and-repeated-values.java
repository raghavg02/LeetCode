class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        long expectedSum = (long) N * (N + 1) / 2;
        long expectedSumSq = (long) N * (N + 1) * (2L * N + 1) / 6;

        long actualSum = 0;
        long actualSumSq = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                actualSum += num;
                actualSumSq += (long) num * num;
            }
        }

        long diff1 = actualSum - expectedSum; // R - M
        long diff2 = actualSumSq - expectedSumSq; // R^2 - M^2 = (R - M)(R + M)

        long sumRM = diff2 / diff1; // R + M

        int repeated = (int) ((diff1 + sumRM) / 2); // (R + R - M + M) / 2 = R
        int missing = (int) (sumRM - repeated); // M = R + M - R

        return new int[] { repeated, missing };
    }
}