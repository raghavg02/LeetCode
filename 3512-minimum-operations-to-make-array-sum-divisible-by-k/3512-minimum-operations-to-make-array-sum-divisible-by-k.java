class Solution {
    public int minOperations(int[] nums, int k) {
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
        }
        return currSum%k;
    }
}