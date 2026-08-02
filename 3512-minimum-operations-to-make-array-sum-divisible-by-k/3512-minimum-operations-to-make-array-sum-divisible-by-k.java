class Solution {
    public int minOperations(int[] nums, int k) {
        int currSum = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
        }
        if (currSum % k == 0) {
            return 0;
        }
        while (currSum>=0) {
            currSum -= 1;
            counter++;
            if(currSum%k==0){
                break;
            }
        }
        return counter;
    }
}